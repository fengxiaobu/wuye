package cn.rzhd.wuye.utils;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * luopa 在 2017/6/9 创建.
 */
public class BeanUtils {
    public static Map<String, Object> objectToMap(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            if (obj == null) {
                return null;
            }
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.get(obj) instanceof String) {
                    if (field.get(obj) != null && !field.get(obj).equals("")) {
                        map.put(field.getName(), field.get(obj));
                    }
                } else if (field.get(obj) instanceof Long) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof Integer) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof Date) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), StringTimeUtil.format((Date) field.get(obj)));
                    }
                } else if (field.get(obj) instanceof Double) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof Float) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof BigInteger) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof Short) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else if (field.get(obj) instanceof BigInteger) {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), String.valueOf(field.get(obj)));
                    }
                } else {
                    if (field.get(obj) != null) {
                        map.put(field.getName(), field.get(obj));
                    }
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;
    }
}
