package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorationNotice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * 装修须知
 */
@Mapper
public interface DecorationNoticeMapper {
    int deleteByPrimaryKey(@Param("decorationNoticeId") Long decorationNoticeId);

    int insert(DecorationNotice decorationNotice);

    DecorationNotice selectByPrimaryKey(@Param("decorationNoticeId") Long decorationNoticeId);

    List<DecorationNotice> selectAll();

    int updateByPrimaryKey(DecorationNotice decorationNotice);
}
