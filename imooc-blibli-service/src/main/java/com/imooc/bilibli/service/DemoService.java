package com.imooc.bilibli.service;

import com.imooc.bilibli.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    @Autowired
    DemoDao demoDao;
    public Long query(Long id){
     return demoDao.query(id);
    }
}
