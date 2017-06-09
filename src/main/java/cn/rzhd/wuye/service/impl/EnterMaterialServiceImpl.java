package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.mapper.EnterMaterialMapper;
import cn.rzhd.wuye.service.IEnterMaterialService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 */
@Service
public class EnterMaterialServiceImpl implements IEnterMaterialService {

    @Autowired
    private EnterMaterialMapper enterMaterialMapper;
    @Override
    public List<Map<String, JsonFormat.Value>> findEnterMaterialList() {

        return enterMaterialMapper.findEnterMaterial();
    }

    /**
     * 获取项目信息(资料夹)
     * @param pkproject
     * @return
     */
    @Override
    public EnterMaterial findEnterMaterialByHouseId(String pkproject) {
        return enterMaterialMapper.findEnterMaterialByHouseId(pkproject);
    }
}
