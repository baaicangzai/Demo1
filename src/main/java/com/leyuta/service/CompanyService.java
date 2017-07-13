package com.leyuta.service;

import com.leyuta.entity.Company;

import java.util.List;
/**
 * Created by  listen on 2017/7/13 0013.
 * 公司业务层接口
 */
public interface CompanyService
{

    /**
     * 通过公司主键id，获取公司信息
     *
     * @param cid
     * @return Company
     */
    Company queryCompanyById(Long cid);

    /**
     * 查询获取所有公司数据
     *
     * @return List<Company>
     */
    List<Company> queryAllCompany();
}
