package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Account;
import cn.rzhd.wuye.vo.query.AccountQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
	List<Account> getWaterElectric(AccountQuery query);
}
