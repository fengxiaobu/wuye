package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.mapper.PropertyFeePayDetailsMapper;
import cn.rzhd.wuye.vo.PropertyFeePayDetailsQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */

public class PropertyFeePayDetailsServiceTest extends BaseTest{
    @Autowired
    PropertyFeePayDetailsMapper mapper;
    @Test
    public void queryAllTest(){
        PropertyFeePayDetailsQuery query = new PropertyFeePayDetailsQuery();
        query.setHouseInfoId(123L);
        query.setInvoiceStatus(0);
        PageHelper.startPage(1,5);
        List<PropertyFeePayDetails> list = mapper.queryAll(query);
        PageInfo pageInfo = new PageInfo(list);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPageSize());
        pageInfo.getList();
        pageInfo.getTotal();
    }


}
