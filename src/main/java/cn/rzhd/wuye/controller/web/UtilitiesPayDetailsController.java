package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.utils.PageDataGridResult;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hasee on 2017/6/2.
 */
@RestController
@RequestMapping("/dist/utilities")
public class UtilitiesPayDetailsController {
    @Autowired
    IUtilitiesService service;

    /**
     *
     * @param query 水电缴费记录通用查询条件对象
     * @return  将符合条件的水和电两表的List组成一个List,再进行分页操作(待数据量足够再进行验证是否成功)
     */
    @RequestMapping("/getList")
    public PageDataGridResult getList(UtilitiesQuery query){
        PageHelper.startPage(query.getStartPage(),query.getPageSize());
        List<UtilitiesDetails> result = service.queryAll(query);
        PageInfo pageInfo = new PageInfo(result);
        PageDataGridResult pageResult = new PageDataGridResult();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());

        return pageResult;
    }

}
