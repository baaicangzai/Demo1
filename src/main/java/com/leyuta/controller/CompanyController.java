package com.leyuta.controller;

import com.leyuta.entity.Company;
import com.leyuta.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by  listen on 2017/7/12
 */
@Controller
@RequestMapping("/company")
public class CompanyController
{

    // 注入 CompanyService
    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @GetMapping("/query/{cid}")
    public Company index(@PathVariable("cid") Long cid)
    {
        Company company = companyService.queryCompanyById(cid);
        return company;
    }

}
