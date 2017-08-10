package com.leyuta.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * CompanyController 控制器测试类
 *
 * @author listen
 * @date 2017/08/10 11:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc // 测试controller需要的注解
public class CompanyControllerTest
{

    // 注入 MockMvc
    @Autowired
    private MockMvc mockMvc;

    /**
     * 查询测试
     */
    @Test
    public void queryTest() throws Exception
    {
        mockMvc.perform(MockMvcRequestBuilders.get("/company/query/1")).andExpect(MockMvcResultMatchers.status().isOk
            ());
    }
}