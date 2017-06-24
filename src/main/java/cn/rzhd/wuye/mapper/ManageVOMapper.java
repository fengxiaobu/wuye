package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.ManageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hasee on 2017/6/23.
 */
@Mapper
public interface ManageVOMapper {
    void addManage(ManageVO vo);

    List<ManageVO> getAll();

    List<ManageVO> getMyManage(Long id);

    void addMyManage(@Param("proId") String proId,@Param("id") Long id);

    void removeByUser(Long id);
}
