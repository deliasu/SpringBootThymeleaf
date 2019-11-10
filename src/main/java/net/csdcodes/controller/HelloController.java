package net.csdcodes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * csdcodes.net
 * Date: 2019/11/10
 */
@Controller
public class HelloController {
    /**
     * @param name
     * @param request
     * @return
     */
    @RequestMapping("/hello")
    private String hello(@RequestParam(value = "name", defaultValue="Springboot-thymeleaf" ) String name, HttpServletRequest request){
        request.setAttribute("name", name);
        return "hello";
    }
}
