package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 */
public interface IEnterMaterialService {
    List<Map<String, JsonFormat.Value>> findEnterMaterialList();

    List<Map<String, JsonFormat.Value>> findEnterMaterialBypkproject(ApplyQuery query);

    EnterMaterial findEnterMaterialByKey(Long enterMaterialId);

    EnterMaterial findEnterMaterialBypkprojectId(String trim);

    void delEnterMaterial(Long enterMaterialId);

    void insertEnterMaterial(EnterMaterial enterMaterial);

}
