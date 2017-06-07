package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.vo.CustomerVO;

/**
 * Created by hasee on 2017/6/1.
 */
public interface ICustomerService {

    Customer loginByPwd(Customer customer);

    void addCustomer(CustomerVO customer);
    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     * @param customerVO
     */
    void saveCustomer(CustomerVO customerVO) throws Exception;

}
