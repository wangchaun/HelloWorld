package com.love.kyubi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: silin
 * @description:
 * @author: siming.wang
 * @create: 2018-11-05 14:19
 **/
@Controller
public class FirstController {

    @RequestMapping("/firstServlet")
    public String firstServlet(String firstPassword){
        if("11041128".equals(firstPassword)){
            return "/show/index";
        }

        return "/common/error";
    }

}
