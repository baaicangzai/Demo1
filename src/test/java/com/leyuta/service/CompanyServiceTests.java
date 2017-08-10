package com.leyuta.service;

import com.leyuta.entity.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CompanyService测试类
 *
 * @author listen
 * @date 2017/08/10 10:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyServiceTests // 或者直接继承 extends DemoApplication
{

    //  注入 CompanyService
    @Autowired
    private CompanyService companyService;

    /**
     * 测试通过主键id查找公司
     */
    @Test
    public void queryByIdTest()
    {
        Company company = companyService.queryCompanyById(1l);
        // 断言判断
        Assert.assertEquals(new Long(1), company.getId());
    }

}
