package com.leyuta.controller;

import com.leyuta.entity.Company;
import com.leyuta.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by  listen on 2017/7/12
 */
@Controller
@RequestMapping("/company")
public class CompanyController
{

    private static final Logger log = LoggerFactory.getLogger(CompanyController.class);

    // 注入 CompanyService
    @Autowired
    private CompanyService companyService;

    @ResponseBody
    @GetMapping("/query/{cid}")
    public Company query(@PathVariable("cid") Long cid)
    {
        log.info("进入index");
        Company company = companyService.queryCompanyById(cid);
        return company;
    }

    @GetMapping("index.html")
    public String index(Model model)
    {
        List<Company> companyList = companyService.queryAllCompany();
        model.addAttribute("companys", companyList);
        return "company/home";
    }

    /**
     * 添加公司测试
     *
     * @param company
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/add")
    public String saveCompany(@Valid Company company, BindingResult bindingResult)
    {
        if ( bindingResult.hasErrors() )
        {
            return bindingResult.getFieldError().getDefaultMessage(); // 返回默认自定义的错误消息
        }
        return "添加成功";
    }

}
