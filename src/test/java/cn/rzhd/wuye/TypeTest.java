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

	@Test
	public void test1() throws Exception {
		List<TypeRefinement> dataList = mapper.getDataList(2);
		for (TypeRefinement typeRefinement : dataList) {
			System.out.println(typeRefinement);
		}
	}

	@Test
	public void test2() throws Exception {
		TypeDifferentiate typeDifferentiate = dmapper.getDataName(1);
		System.out.println(typeDifferentiate);
	}
}
