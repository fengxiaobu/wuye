package cn.rzhd.wuye.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.TDictInfo;
import cn.rzhd.wuye.bean.TDictInfoExample;
import cn.rzhd.wuye.mapper.TDictInfoMapper;
import cn.rzhd.wuye.service.IDictInfoService;



/**
 * 数据字典维护
 * 
 * @Title: TDictInfoService.java
 * @Package com.irzhd.weiye.service
 * @Description:
 * @author qinjuncai
 * @date 2016年8月30日 下午4:43:25
 * @version V1.0
 */
@Service
public class DictInfoServiceImpl implements IDictInfoService{
    @Autowired
    private TDictInfoMapper dictInfoMapper;
    
    @Override
    public TDictInfo findDictInfoByTypeCode(String typeCode) {
        TDictInfoExample example = new TDictInfoExample();
        example.createCriteria().andTypeCodeEqualTo(typeCode);
        List<TDictInfo> list = dictInfoMapper.selectByExample(example );
        if(list != null){
          return list.get(0);  
        }
        return null;
    }

    @Override
    public void updateDictInfoById(TDictInfo dictInfo) {
        //补全信息
        dictInfo.setUpdateTime(new Date());
        dictInfoMapper.updateByPrimaryKey(dictInfo);
    }


}