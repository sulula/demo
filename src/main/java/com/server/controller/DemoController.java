package com.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/getName")
    @ResponseBody
    public String getName(Integer id) {
        String name;
        switch (id) {
            case 1:
                name = "One1";
                break;
            case 3:
                name = "Lily";
                break;
            case 5:
                name = "HaMeiMei";
                break;
            case 6:
                name = "HanLa";
                break;
            case 7:
                name = "Happy";
                break;
            case 9:
                name = "Ten";
                break;
            default:
                name = "Fly";
        }
        return name;

    }


}
