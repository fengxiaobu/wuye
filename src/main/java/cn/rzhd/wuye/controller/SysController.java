package cn.rzhd.wuye.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoleilu.hutool.util.StrUtil;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.bean.TDictInfo;
import cn.rzhd.wuye.bean.TPort;
import cn.rzhd.wuye.bean.TSys;
import cn.rzhd.wuye.bean.vo.AmmeQueryVo;
import cn.rzhd.wuye.bean.vo.HouseInfoDetailsQueryVo;
import cn.rzhd.wuye.bean.vo.ProjectInfoQueryVo;
import cn.rzhd.wuye.common.PageQuery;
import cn.rzhd.wuye.service.IAmmeterService;
import cn.rzhd.wuye.service.IDictInfoService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.service.ISysServer;
import cn.rzhd.wuye.utils.PageDataGridResult;
import cn.rzhd.wuye.vo.HouseVO;

/**
 * @ClassName SysController
 * @Description 系统设置
 * @author qinjuncai
 * @Date 2017年7月1日 下午5:57:12
 * @version 1.0.0
 */
@Controller
@RequestMapping("/admin/sys/")
public class SysController {

    @Autowired
    private IDictInfoService dictInfoService;
    
    @Autowired
    private ISysServer sysServer;
    
    @Autowired
    private IHouseInfoDetailsService houseInfoDetailsService;
    
    @Autowired
    private IProjectInfoService projectInfoService;
    
    @Autowired
    private IAmmeterService ammeterService;
    
    
    /**
     * @Description 跳转水电页面，回显项目下拉
     * @param model
     * @return
     */
    @RequestMapping(value="ammelist",method = RequestMethod.GET)
    public String ammelist(Model model){
       // List<ProjectInfo> projectList = projectInfoService.selectPKAndName();
        //model.addAttribute("projectList", projectList);
        return "system/ammeter/ammelist";
    }
    
    
    
    /**
     * @Description 系统设置数据回显
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="set",method = RequestMethod.GET)
    public String set(Model model){
        TSys result = new TSys();
        result = this.sysServer.findSysOnlyOne();
        model.addAttribute("sys", result);
        return "system/sys";
    }
    
    
    
    /**
     * @Description 房产限制编辑页面回显
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="housrestedit",method = RequestMethod.GET)
    public String housrestedit(String pkHouse,String vcname,Model model){
        HouseInfoDetails houseVO = new HouseInfoDetails();
        if(StrUtil.isNotBlank(pkHouse)){
            houseVO = houseInfoDetailsService.selectHouseInfoDetailsById(pkHouse);
        }
        model.addAttribute("houseVO", houseVO);
        model.addAttribute("vcname", vcname);
        return "system/waterele/housrestedit";
    }
    
    /**
     * @Description 项目限制编辑页面回显
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="projectrestedit",method = RequestMethod.GET)
    public String projectrestedit(String pkProject,Model model){
        ProjectInfo projectInfo = new ProjectInfo();
        if(StrUtil.isNotBlank(pkProject)){
            projectInfo = projectInfoService.selectByPrimaryKey(pkProject);
        }
        model.addAttribute("projectInfo", projectInfo);
        return "system/waterele/projectrestedit";
    }
    
    /**
     * @Description 查找所有项目名称和id
     * @return
     */
    @RequestMapping(value = "findallproject", method = RequestMethod.GET)
    public ResponseEntity<List<ProjectInfo>> findAllProject() {
            try {
                
                List<ProjectInfo> result = projectInfoService.selectPKAndName();
                return ResponseEntity.ok(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 出错 500
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
      }
    /**
     * @Description 根据项目主键查找所有房产
     * @return
     */
    @RequestMapping(value = "findallhouse", method = RequestMethod.GET)
    public ResponseEntity<List<HouseInfoDetails>> findallhouse(String pkProject) {
            try {
                
               List<HouseInfoDetails> result = houseInfoDetailsService.selectByPkProject(pkProject);
                return ResponseEntity.ok(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 出错 500
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    
    /**
     * @Description 新增电表
     * @param ammeter
     * @return
     */
    @RequestMapping(value = "ammeadd", method = RequestMethod.POST)
    public ResponseEntity<Void> save(Ammeter ammeter) {
        try {
            //400
            if(ammeter ==null || StrUtil.isBlank(ammeter.getPk_house()) || StrUtil.isBlank(ammeter.getPk_project())){
                // 响应201
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            // 新增
            this.ammeterService.add(ammeter);

            // 响应201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    @RequestMapping(value="ammeter/del/{id}",method = RequestMethod.POST)
    public ResponseEntity<Void> del(@PathVariable("id") String id) {
        try {
            this.ammeterService.del(id);
            // 成功 204
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    /**
     * @Description 电表编辑页面回显
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value="ammeedit",method = RequestMethod.GET)
    public String ammeedit(String id,Model model){
        Ammeter ammeter = new Ammeter();
        if(StrUtil.isNotBlank(id)){
            //TODO
            //ammeter = sysServer.selectAmmeById(id);
        }
        model.addAttribute("ammeter", ammeter);
        return "system/ammeter/ammeredit";
    }
    
    /**
     * @Description 更新房产水电限制
     * @param houseInfoDetails
     * @return
     */
    @RequestMapping(value = "updatehouse", method = RequestMethod.POST)
    public ResponseEntity<Void> updatehouse(HouseInfoDetails houseInfoDetails) {
        try {

            if (houseInfoDetails == null || StrUtil.isEmpty(houseInfoDetails.getPkHouse())) {
                // 响应400
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }

            //补全信息
            houseInfoDetails.setUpdatedate(new Date());
            // 新增或编辑签约信息
            this.houseInfoDetailsService.updatehouse(houseInfoDetails);

            // 响应201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 更新项目水电限制
     * @param houseInfoDetails
     * @return
     */
    @RequestMapping(value = "updateproject", method = RequestMethod.POST)
    public ResponseEntity<Void> updateproject(ProjectInfo projectInfo) {
        try {

            if (projectInfo == null || StrUtil.isEmpty(projectInfo.getPkProject())) {
                // 响应400
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }

            //补全信息
            projectInfo.setUpdateDate(new Date());
            // 新增或编辑签约信息
            this.projectInfoService.updateProjectForSys(projectInfo);

            // 响应201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 跳转到更名须知、装修须知、入住提示信息页面
     * @param typeCode
     * @param model
     * @return
     */
    @RequestMapping(value="{page}/{typeCode}",method = RequestMethod.GET)
    public String toRename(@PathVariable("page") String page,@PathVariable("typeCode") String typeCode,Model model){
        TDictInfo result = this.dictInfoService.findDictInfoByTypeCode(typeCode);
        model.addAttribute("dictInfo", result);
        return "system/"+page;
    }
    
    /**
     * @Description 更新更名须知
     * @param dictInfo
     * @return
     */
    @RequestMapping(value="editrename",method = RequestMethod.POST)
    public ResponseEntity<Void> editrename(TDictInfo dictInfo) {
        try {
            if(dictInfo == null || StrUtil.isBlank(dictInfo.getId())){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            this.dictInfoService.updateDictInfoById(dictInfo);
            // 成功 200
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    
    /**
     * @Description 新增或编辑系统设置
     * @param sys
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Void> save(TSys sys) {
        try {

            // 新增或编辑
            this.sysServer.saveOrUpdate(sys);

            // 响应201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 分页查询房产电费限制
     * @param vhname 房产名称
     * @param page 起始页
     * @param rows 每页显示的条数
     * @return
     */
    @RequestMapping(value = "queryHouseListByPage", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PageDataGridResult> queryHouseListByPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows,String vhcode) {
        try {
            
            /**
             * 构建查询条件
             */
            HouseInfoDetailsQueryVo queryVo = new HouseInfoDetailsQueryVo();
            queryVo.setVhcode(vhcode);
            
            // 查询列表的总数
            int total = sysServer.findHouseCount(queryVo);
            
            /**
             * 构建查询条件
             */
            PageQuery pageQuery = new PageQuery();
            pageQuery.setPageParams(total, rows, page);
            queryVo.setPageQuery(pageQuery );
            queryVo.setPageQuery(pageQuery);
            
            // 分页查询，向queryVo中传入pageQuery
            List<HouseInfoDetails> list = sysServer.findHouseListPage(queryVo);
            
            PageDataGridResult pageResult = new PageDataGridResult();
            // 填充 total
            pageResult.setTotal(total);
            // 填充 rows
            pageResult.setRows(list);
            
            return ResponseEntity.ok(pageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 分页查询项目电费限制
     * @param vhname 房产名称
     * @param page 起始页
     * @param rows 每页显示的条数
     * @return
     */
    @RequestMapping(value = "queryProjectListByPage", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PageDataGridResult> queryProjectListByPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows,String projectName) {
        try {
            
            /**
             * 构建查询条件
             */
            ProjectInfoQueryVo queryVo = new ProjectInfoQueryVo();
            queryVo.setProjectName(projectName);
            
            // 查询列表的总数
            int total = sysServer.findProjectCount(queryVo);
            
            /**
             * 构建查询条件
             */
            PageQuery pageQuery = new PageQuery();
            pageQuery.setPageParams(total, rows, page);
            queryVo.setPageQuery(pageQuery );
            queryVo.setPageQuery(pageQuery);
            
            // 分页查询，向queryVo中传入pageQuery
            List<ProjectInfo> list = sysServer.findProjectListPage(queryVo);
            
            PageDataGridResult pageResult = new PageDataGridResult();
            // 填充 total
            pageResult.setTotal(total);
            // 填充 rows
            pageResult.setRows(list);
            
            return ResponseEntity.ok(pageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 分页查询电表
     * @param page
     * @param rows
     * @param projectName
     * @param ammeter_no
     * @return
     */
    @RequestMapping(value = "queryAmmeByPage", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PageDataGridResult> queryAmmeByPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows,String projectName,String ammeterNo) {
        try {
            
            /**
             * 构建查询条件
             */
            AmmeQueryVo queryVo = new AmmeQueryVo();
            queryVo.setAmmeterNo(ammeterNo);
            queryVo.setProjectName(projectName);
            
            // 查询列表的总数
            int total = sysServer.findAmmeCount(queryVo);
            
            /**
             * 构建查询条件
             */
            PageQuery pageQuery = new PageQuery();
            pageQuery.setPageParams(total, rows, page);
            queryVo.setPageQuery(pageQuery );
            queryVo.setPageQuery(pageQuery);
            
            // 分页查询，向queryVo中传入pageQuery
            List<Ammeter> list = sysServer.findAmmeListPage(queryVo);
            
            PageDataGridResult pageResult = new PageDataGridResult();
            // 填充 total
            pageResult.setTotal(total);
            // 填充 rows
            pageResult.setRows(list);
            
            return ResponseEntity.ok(pageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
}
