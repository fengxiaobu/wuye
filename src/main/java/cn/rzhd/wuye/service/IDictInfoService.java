package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.TDictInfo;
import cn.rzhd.wuye.bean.TDictType;

/**
 * @ClassName IDictInfoService
 * @Description 数据字典维护
 * @author qinjuncai
 * @Date 2017年7月1日 下午9:23:58
 * @version 1.0.0
 */
public interface IDictInfoService {

    /**
     * @Description 根据typeCode查询DictInfo （返回唯一）
     * @param typeCode
     * @return
     */
    TDictInfo findDictInfoByTypeCode(String typeCode);

    /**
     * @Description 根据主键id选择性更新TDictInfo
     * @param dictInfo
     */
    void updateDictInfoById(TDictInfo dictInfo);

}
