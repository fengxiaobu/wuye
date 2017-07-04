package cn.rzhd.wuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiaoleilu.hutool.util.StrUtil;

import cn.rzhd.wuye.bean.TDictInfo;
import cn.rzhd.wuye.bean.TSys;
import cn.rzhd.wuye.service.IDictInfoService;
import cn.rzhd.wuye.service.ISysServer;

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
}
