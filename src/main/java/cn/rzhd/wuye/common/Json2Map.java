package cn.rzhd.wuye.common;

import org.codehaus.jettison.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hasee on 2017/5/26.
 */
public class Json2Map {
    public Map<String,Object>  str2Map(String str){
        Map<String,Object> map = new HashMap<>();
        JSONObject json;
        try {
            json = new JSONObject(str);
            Iterator<String> keys = json.keys();
            Boolean flag = true;
            while(keys.hasNext()&&flag){
                String name = keys.next();
                map.put(name,json.getString(name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
