package com.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/getName")
    @ResponseBody
    public String getName() {
        return "Lily";
    }

    @ResponseBody
    public String getName(Integer id) {
        if (id == 3) {
            return "HaMeiMei";
        }
        if (id == 6) {
            return "Hana";
        }
        if (id == 9) {
            return "Happy";
        }
        if (id == 19) {
            return "Nano";
        }
        return "Lily";
    }


}
