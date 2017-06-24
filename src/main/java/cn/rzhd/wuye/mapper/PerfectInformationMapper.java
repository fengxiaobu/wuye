package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.PerfectInformation;

@Mapper
public interface PerfectInformationMapper {
	void deleteByPrimaryKey(String perfectInformationId);

	void insert(PerfectInformation perfectInformation);

	void updateByPrimaryKey(PerfectInformation perfectInformation);

	PerfectInformation selectByPrimaryKey(String perfectInformationId);

	List<PerfectInformation> selectAll();
	
	void updateFlow(String vccode);
}
