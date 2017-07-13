package com.leyuta.service;

import com.leyuta.entity.Company;
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
}
