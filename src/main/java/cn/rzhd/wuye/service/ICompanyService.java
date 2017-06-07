package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.vo.CorpVO;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public interface ICompanyService {

    void addCompany(CorpVO company);

    List<Company> getAll();
    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     * @param company
     */
    void saveRecords(CorpVO company) throws Exception;
}
