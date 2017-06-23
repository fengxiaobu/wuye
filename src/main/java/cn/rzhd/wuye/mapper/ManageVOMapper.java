package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.ManageVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/6/23.
 */
@Mapper
public interface ManageVOMapper {
    void addManage(ManageVO vo);
}
