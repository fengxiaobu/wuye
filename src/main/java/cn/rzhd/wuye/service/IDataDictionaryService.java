package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.TypeDifferentiate;

public interface IDataDictionaryService {

     void addType(TypeDifferentiate typeDifferentiate);

    TypeDifferentiate findTypeDifferentiateNameIsRepeat(String typeDifferentiateName);
}
