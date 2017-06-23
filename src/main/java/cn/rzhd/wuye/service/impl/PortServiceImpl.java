package cn.rzhd.wuye.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.rzhd.wuye.bean.TPort;
import cn.rzhd.wuye.bean.TPortExample;
import cn.rzhd.wuye.bean.TPortExample.Criteria;
import cn.rzhd.wuye.mapper.TPortMapper;
import cn.rzhd.wuye.utils.IDUtils;
import cn.rzhd.wuye.utils.PageDataGridResult;

/**
 * @ClassName PortServiceImpl
 * @Description 接口管理
 * @author qinjuncai
 * @Date 2017年6月23日 下午9:58:07
 * @version 1.0.0
 */
@Service
public class PortServiceImpl {

    @Autowired
    private TPortMapper mapper;

    /**
     * @Description 新增
     * @param tPort
     */
    public void save(TPort tPort) {
        tPort.setUpdateTime(new Date());
        //编辑
        if(StringUtils.isNotBlank(tPort.getId())){
            mapper.updateByPrimaryKey(tPort);
        }
        //新增
        else{
            // 补全数据
            tPort.setId(IDUtils.genId());
            tPort.setAddTime(new Date());
            mapper.insertSelective(tPort);
        }
        
      
    }

    public PageDataGridResult queryListByPage(Integer page, Integer rows, String title, String startTime,
            String endTime) throws Exception {
        
        TPortExample example = new TPortExample();
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

        Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(title)) {
            criteria.andTitleLike("%"+title+"%");
        }
        if (StringUtils.isNotBlank(startTime)) {

            criteria.andUpdateTimeLessThanOrEqualTo(fmt.parse(startTime));
        }
        if (StringUtils.isNotBlank(endTime)) {
            criteria.andUpdateTimeGreaterThanOrEqualTo(fmt.parse(endTime));

        }
        // 分页处理
        PageHelper.startPage(page, rows);
        List<TPort> list = mapper.selectByExample(example);
        // 取记录总条数
        PageInfo<TPort> pageInfo = new PageInfo<>(list);
        return new PageDataGridResult(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * @Description 跳转编辑页面数据回显
     * @param id
     * @return
     */
    public TPort findById(String id) {
        
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * @Description 删除单条
     * @param id
     */
    public void del(String id) {
        mapper.deleteByPrimaryKey(id);
    }

}