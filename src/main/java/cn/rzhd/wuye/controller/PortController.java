package cn.rzhd.wuye.controller;

import java.util.Date;

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


import cn.rzhd.wuye.bean.TPort;
import cn.rzhd.wuye.service.impl.PortServiceImpl;
import cn.rzhd.wuye.utils.PageDataGridResult;

/**
 * @ClassName PortController
 * @Description 接口管理
 * @author qinjuncai
 * @Date 2017年6月22日 下午9:14:16
 * @version 1.0.0
 */
@Controller
@RequestMapping("/dist/port/")
public class PortController {

    @Autowired
    private   PortServiceImpl portServiceImpl;


    /**
     * 接口通用地址跳转
     * 
     * @param pageName
     *            需要跳转的页面
     * @param projectId
     *            项目id
     * @param model
     * @return
     */
    @RequestMapping(value = "{pageName}", method = RequestMethod.GET)
    public String toPage(@PathVariable("pageName") String pageName, Model model) {
        return "port/" + pageName;
    }
    
    /**
     * @Description 新增或编辑（已是否存在id判断）
     * @param tPort
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Void> save(TPort tPort) {
        try {

            // 新增或编辑
            this.portServiceImpl.save(tPort);

            // 响应201
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 分页查询接口列表
     * @param title 标题
     * @param startTime 更新开始时间
     * @param endTime 更新结束时间
     * @param page 起始页数
     * @param rows 每页显示条数
     * @return
     */
    @RequestMapping(value = "queryListByPage", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PageDataGridResult> queryListByPage(String title,String startTime,String endTime,@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows) {
        try {
            PageDataGridResult result = portServiceImpl.queryListByPage(page, rows, title,startTime,endTime);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
    /**
     * @Description 跳转编辑页面数据回显
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") String id,Model model) {
        TPort port = portServiceImpl.findById(id);
        model.addAttribute("port", port);
        return "port/edit";
    }
    
    /**
     * @Description 删除单条
     * @param id 
     * @return
     */
    @RequestMapping(value="del/{id}",method = RequestMethod.POST)
    public ResponseEntity<Void> del(@PathVariable("id") String id) {
        try {
            this.portServiceImpl.del(id);
            // 成功 204
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 出错 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
