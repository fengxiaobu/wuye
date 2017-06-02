package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Customer;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/6/1.
 * 针对客户进行操作
 */
@Mapper
public interface CustomerMapper {
    /**
     *
     * @param customer 将账号为客户编码  密码初始为MD5编码后的123456封装到Customer对象中
     * @return 账号密码吻合的Customer
     */
    Customer loginByPwd(Customer customer);
}
