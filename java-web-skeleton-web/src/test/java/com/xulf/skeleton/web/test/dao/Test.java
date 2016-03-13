package com.xulf.skeleton.web.test.dao;

import com.xulf.skeleton.web.domain.TestTable;
import com.xulf.skeleton.web.mapper.TestTableMapper;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/3/13.
 */
public class Test extends BaseDaoTest {
    @Resource
    private TestTableMapper testTableMapper;

    @org.junit.Test
    public void insertTest(){
        TestTable testTable = new TestTable();
        testTable.setId(2);

        testTableMapper.insert(testTable);
    }
}
