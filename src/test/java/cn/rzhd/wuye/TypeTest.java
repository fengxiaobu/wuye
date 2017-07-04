package cn.rzhd.wuye;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.bean.TypeRefinement;
import cn.rzhd.wuye.mapper.TypeDifferentiateMapper;
import cn.rzhd.wuye.mapper.TypeRefinementMapper;

public class TypeTest extends BaseTest {
	@Autowired
	TypeRefinementMapper mapper;
	@Autowired
	TypeDifferentiateMapper dmapper;

}
