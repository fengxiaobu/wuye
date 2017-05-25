package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

@Mapper
public interface UserMapper {
    
    public List<Map<String, Value>> findUserList(@Param("pageStartRow")Integer pageStartRow,@Param("pageEndRow") Integer pageEndRow);
    
    public List<Map<String, Value>> findUserByCondition(@Param("condition") String condition,@Param("pageStartRow") Integer pageStartRow,@Param("pageEndRow") Integer pageEndRow);
    
    public void updateUser(@Param("user") User user);
    
    public void delUserById(@Param("userId") Long userId);
}
