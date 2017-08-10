package com.leyuta.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
/**
 * Created by  listen on 2017/7/13 0013.
 * 公司类
 */
public class Company
{

    /**
     * 主键id
     */
    private Long id;

    /**
     * 公司名称
     */
    @NotNull(message = "名称不能为空") // 注解验证不能为空
    @Length(min = 3, max = 20, message = "公司名称3-20个字符哦") // 注解验证字符串长度
    private String name;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 公司电话
     */
    private String phone;

    /**
     * 注册时间
     */
    private Timestamp regTime;

    /**
     * 到期日期
     */
    private Date expireDate;

    public Company()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Timestamp getRegTime()
    {
        return regTime;
    }

    public void setRegTime(Timestamp regTime)
    {
        this.regTime = regTime;
    }

    public Date getExpireDate()
    {
        return expireDate;
    }

    public void setExpireDate(Date expireDate)
    {
        this.expireDate = expireDate;
    }

    @Override
    public String toString()
    {
        return "Company{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' + ", phone='" +
            phone + '\'' + ", regTime=" + regTime + ", expireDate=" + expireDate + '}';
    }
}
