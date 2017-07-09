package cn.rzhd.wuye.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiaoleilu.hutool.util.StrUtil;
import com.ctc.wstx.util.StringUtil;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.bean.TSys;
import cn.rzhd.wuye.bean.TSysExample;
import cn.rzhd.wuye.bean.vo.AmmeQueryVo;
import cn.rzhd.wuye.bean.vo.HouseInfoDetailsQueryVo;
import cn.rzhd.wuye.bean.vo.ProjectInfoQueryVo;
import cn.rzhd.wuye.mapper.SysMapperCustom;
import cn.rzhd.wuye.mapper.TSysMapper;
import cn.rzhd.wuye.service.ISysServer;
import cn.rzhd.wuye.utils.IDUtils;
import cn.rzhd.wuye.utils.PageDataGridResult;

@Service
public class SysServerImpl implements ISysServer {

    @Autowired
    private TSysMapper sysMapper;

    @Autowired
    private SysMapperCustom sysMapperCustom;
    
    @Override
    public TSys findSysByid(String id) {
        return sysMapper.selectByPrimaryKey(id);
    }

    @Override
    public TSys findSysOnlyOne() {
        TSysExample example = new TSysExample();
        example.createCriteria();
        List<TSys> list = sysMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void saveOrUpdate(TSys sys) {
        
        //补全信息
        sys.setUpdateTime(new Date());
        
        // 编辑
        if (sys != null && sys.getId() != null) {
           
            sysMapper.updateByPrimaryKey(sys);
        }
        // 新增
        else {
            sys.setId(IDUtils.genId());
            sysMapper.insert(sys);
        }

    }

    @Override
    public int findHouseCount(HouseInfoDetailsQueryVo queryVo) {
        return sysMapperCustom.findHouseCount(queryVo);
    }

    @Override
    public List<HouseInfoDetails> findHouseListPage(HouseInfoDetailsQueryVo queryVo) {
        return sysMapperCustom.findHouseListPage(queryVo);
    }

    @Override
    public int findProjectCount(ProjectInfoQueryVo queryVo) {
        return sysMapperCustom.findProjectCount(queryVo);
    }

    @Override
    public List<ProjectInfo> findProjectListPage(ProjectInfoQueryVo queryVo) {
        return sysMapperCustom.findProjectListPage(queryVo);
    }

    @Override
    public int findAmmeCount(AmmeQueryVo queryVo) {
        // TODO Auto-generated method stub
        return sysMapperCustom.findAmmeCount(queryVo);
    }

    @Override
    public List<Ammeter> findAmmeListPage(AmmeQueryVo queryVo) {
        // TODO Auto-generated method stub
        return sysMapperCustom.findAmmeListPage(queryVo);
    }




}
