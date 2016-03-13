package com.xulf.skeleton.web.controller;

import com.xulf.skeleton.web.domain.TestTable;
import com.xulf.skeleton.web.mapper.TestTableMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xuliufeng on 2015/12/31.
 */
@Controller
public class HelloSpringMVC {
    @Resource
    private TestTableMapper testTableMapper;

    @RequestMapping("/hello/mapper")
    @ResponseBody
    public String testMapper(){
        TestTable testTable = new TestTable();
        testTable.setId(2);
        int rows = testTableMapper.insert(testTable);

        if(rows > 0){
            return "mapper insertion succeeds";
        }else {
            return "mapper insert fails";
        }
    }

    @RequestMapping("/hello/json")
    @ResponseBody
    public String testJson(String name) {
        if (name != null) {
            return String.format("hello, %s", name);
        }

        return "hello json!";
    }

    @RequestMapping("/hello/jsp")
    public String testJsp() {
        return "hello";
    }

    @RequestMapping("/hello/direct")
    public String testDirect() {
        return "redirect";
    }
}
