package com.xulf.skeleton.web.mapper;

import com.xulf.skeleton.web.domain.TestTable;

public interface TestTableMapper {
    int insert(TestTable record);

    int insertSelective(TestTable record);
}