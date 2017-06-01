package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.mapper.TypeDifferentiateMapper;
import cn.rzhd.wuye.service.IDataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataDictionaryServiceImpl implements IDataDictionaryService {

    @Autowired
    private TypeDifferentiateMapper typeMapper;
    @Override
    public void addType(TypeDifferentiate typeDifferentiate) {
	
	TypeDifferentiate nameIsRepeat = typeMapper.findTypeDifferentiateNameIsRepeat(typeDifferentiate.getTypeDifferentiateName());
	if (nameIsRepeat != null) {
	    //重复执行状态已经备注修改操作
	    nameIsRepeat.setStatus(typeDifferentiate.getStatus());
	    if (typeDifferentiate.getNote() != null) {
		nameIsRepeat.setNote(typeDifferentiate.getNote());
	    }
	    nameIsRepeat.setUpdateTime(new Date());
	    typeMapper.updateTypeDifferentiateById(nameIsRepeat);
	    
	}else {
	    Long typeDifferentiateId = typeMapper.findTypeDifferentiateId();
	    typeDifferentiate.setTypeDifferentiateId(typeDifferentiateId+1);
	    typeDifferentiate.setCreateTime(new Date());
	    typeMapper.addTypeDifferentiate(typeDifferentiate);
	}
	
	
    }

}
