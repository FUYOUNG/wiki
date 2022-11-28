package com.my.wiki.mapper;

import com.my.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {

    public List<Test> list();
}
