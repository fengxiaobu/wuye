package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.Account;
import cn.rzhd.wuye.vo.query.AccountQuery;

@Mapper
public interface AccountMapper {
	List<Account> getWaterElectric(AccountQuery query);
}
