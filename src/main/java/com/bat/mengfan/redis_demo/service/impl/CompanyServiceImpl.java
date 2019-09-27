package com.bat.mengfan.redis_demo.service.impl;

import com.bat.mengfan.redis_demo.dao.CompanyDao;
import com.bat.mengfan.redis_demo.pojo.Company;
import com.bat.mengfan.redis_demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    /*@Autowired*/
    private CompanyDao companyDao;
    @Override
    public List<Company> queryAllCompany() {
        return companyDao.queryAllCompany();
    }
}
