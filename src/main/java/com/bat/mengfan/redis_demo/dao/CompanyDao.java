package com.bat.mengfan.redis_demo.dao;

import com.bat.mengfan.redis_demo.pojo.Company;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyDao {
    List<Company> queryAllCompany();
}
