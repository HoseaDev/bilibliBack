package com.imooc.bilibli.api;

import com.imooc.bilibli.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {

    @Autowired
    DemoService service;


    @GetMapping("/query")
    public Long query(Long id) {
        System.out.println("id=" + id);
        return service.query(id);
//        return 9999L;
    }

}
