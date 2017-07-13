package com.leyuta.dao;

import com.leyuta.entity.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by  listen on 2017/7/13 0013.
 * 操作company数据表的dao类
 */
@Mapper
public interface CompanyDao
{

    /**
     * 根据主键id，获取company
     *
     * @param cid
     * @return Company
     */
    Company getCompanyById(@Param("cid") Long cid);

    /**
     * 获取所有公司列表
     *
     * @return
     */
    List<Company> listAllCompanny();
}
