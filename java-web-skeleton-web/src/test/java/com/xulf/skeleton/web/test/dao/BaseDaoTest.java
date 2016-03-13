package com.xulf.skeleton.web.test.dao;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangwenyao on 2015/6/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-jdbc.xml"})
public abstract class BaseDaoTest {
    public static Logger logger = LoggerFactory.getLogger(BaseDaoTest.class);

}
