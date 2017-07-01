package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.vo.CustomerVO;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
public interface ICustomerService {

    List<Customer> loginByPwd(Customer customer);

    void addCustomer(CustomerVO customer);

    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     *
     * @param customerVO
     */
    void saveCustomer(CustomerVO customerVO) throws Exception;

    void updadteState(String currentFlow, String vccode);

    List<Customer> queryAll();
}
