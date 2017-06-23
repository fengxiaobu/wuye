package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.ManageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/6/23.
 */
@Mapper
public interface ManageVOMapper {
    void addManage(ManageVO vo);

    List<ManageVO> getAll();

    List<ManageVO> getMyManage(Long id);
}
