package com.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/getName")
    @ResponseBody
    public String getName(Integer id) {
        if (id == null) return null;
        String[] array = {"One", "Tonny", "Lily", "Frank", "HaMeiMei", "HanLa", "Happy", "Van", "Fly", "Ten"};
        return array[id - 1];
    }
}
