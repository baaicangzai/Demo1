package com.leyuta.service.impl;

import com.leyuta.dao.CompanyDao;
import com.leyuta.entity.Company;
import com.leyuta.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by  listen on 2017/7/13 0013.
 * 公司业务实现类
 */
@Service
public class CompanyServiceImpl implements CompanyService
{

    // 注入company DAO 层
    @Autowired
    private CompanyDao companyDao;

    @Override
    public Company queryCompanyById(Long cid)
    {

        return companyDao.getCompanyById(cid);
    }
}
