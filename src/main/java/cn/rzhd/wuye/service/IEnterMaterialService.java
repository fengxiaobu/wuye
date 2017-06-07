package cn.rzhd.wuye.service;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 */
public interface IEnterMaterialService {
    List<Map<String, JsonFormat.Value>> findEnterMaterialList();
}
