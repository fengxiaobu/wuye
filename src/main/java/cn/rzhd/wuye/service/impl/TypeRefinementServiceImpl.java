package cn.rzhd.wuye.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.bean.TypeRefinement;
import cn.rzhd.wuye.bean.vo.TypeRefinementVo;
import cn.rzhd.wuye.mapper.TypeDifferentiateMapper;
import cn.rzhd.wuye.mapper.TypeRefinementMapper;
import cn.rzhd.wuye.service.ITypeRefinementService;

@Service
public class TypeRefinementServiceImpl implements ITypeRefinementService {

    @Autowired
    private TypeRefinementMapper mapper;
    
    @Autowired
    private TypeDifferentiateMapper difMapper;
    
    @Override
    public void addTypeRefinement(TypeRefinementVo typeRefinementVo) {
	TypeRefinement typeRefinement = new TypeRefinement();
	
	TypeRefinement nameIsRepeat = mapper.findTypeRefinementNameIsRepeat(typeRefinementVo.getTypeRefinementName());
	if (nameIsRepeat != null ) {
	    //执行修改操作
//	    nameIsRepeat.setTypeRefinementId(nameIsRepeat.getTypeDifferentiateId());
	    nameIsRepeat.setStatus(typeRefinementVo.getStatus());
	    nameIsRepeat.setNote(typeRefinementVo.getNote());
	    nameIsRepeat.setUpdateTime(new Date());
	    mapper.updatetypeRefinementById(nameIsRepeat);
	    
	}else {
	    //执行新建操作
	    Long findRefinementId = mapper.findRefinementId();
	    if (findRefinementId == null || findRefinementId == 0) {
		typeRefinement.setTypeRefinementId(Long.valueOf("1"));
	    }else {
		typeRefinement.setTypeRefinementId(findRefinementId+1);
	    }
	    
//	    TypeDifferentiate typeDifferentiate = mapper.findTypeDifferentiateIdByName(typeRefinementVo.getTypeDifferentiateName());
	    TypeDifferentiate typeDifferentiate = difMapper.findTypeDifferentiateNameIsRepeat(typeRefinementVo.getTypeDifferentiateName());
	    typeRefinement.setTypeDifferentiateId(typeDifferentiate.getTypeDifferentiateId());
	    typeRefinement.setTypeRefinementName(typeRefinementVo.getTypeRefinementName());
	    typeRefinement.setStatus(typeRefinementVo.getStatus());
	    typeRefinement.setNote(typeRefinementVo.getNote());
	    typeRefinement.setCreateTime(new Date());
	    mapper.addTypeRefinementName(typeRefinement);
	    
	}
	
    }

}
