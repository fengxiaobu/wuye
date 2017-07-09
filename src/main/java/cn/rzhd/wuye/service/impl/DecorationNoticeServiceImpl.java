package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.DecorationNotice;
import cn.rzhd.wuye.mapper.DecorationNoticeMapper;
import cn.rzhd.wuye.service.IDecorationNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * <p>
 * 装修须知
 */
@Service
public class DecorationNoticeServiceImpl implements IDecorationNoticeService {
    @Autowired
    DecorationNoticeMapper decorationNoticeMapper;

    /**
     * 根据主键ID删除
     *
     * @param decorationNoticeId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long decorationNoticeId) {
        if (decorationNoticeId == null) {
            return decorationNoticeMapper.deleteByPrimaryKey(decorationNoticeId);
        }
        return 0;

    }

    /**
     * 添加
     *
     * @param decorationNotice
     * @return
     */
    @Override
    public int insert(DecorationNotice decorationNotice) {

        return decorationNoticeMapper.insert(decorationNotice);
    }

    /**
     * 根据主键ID查询
     *
     * @param decorationNoticeId
     * @return
     */
    @Override
    public DecorationNotice selectByPrimaryKey(Long decorationNoticeId) {
        return decorationNoticeMapper.selectByPrimaryKey(decorationNoticeId);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<DecorationNotice> selectAll() {
        return decorationNoticeMapper.selectAll();
    }

    /**
     * 更新
     *
     * @param decorationNotice
     * @return
     */
    @Override
    public int updateByPrimaryKey(DecorationNotice decorationNotice) {
        return decorationNoticeMapper.updateByPrimaryKey(decorationNotice);
    }
}
