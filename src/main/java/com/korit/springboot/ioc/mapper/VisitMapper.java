package com.korit.springboot.ioc.mapper;

import com.korit.springboot.ioc.mapper.dto.Visit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VisitMapper {
    int insert(Visit visit);
}
