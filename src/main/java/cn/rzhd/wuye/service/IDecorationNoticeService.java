package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.DecorationNotice;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 *
 * 装修须知
 */
public interface IDecorationNoticeService {

    int deleteByPrimaryKey(Long decorationNoticeId);

    int insert(DecorationNotice decorationNotice);

    DecorationNotice selectByPrimaryKey( Long decorationNoticeId);

    List<DecorationNotice> selectAll();

    int updateByPrimaryKey(DecorationNotice decorationNotice);
}
