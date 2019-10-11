package com.stackroute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/display")
    public ModelAndView display(@RequestParam ("t1") String s1 , @RequestParam ("t2") String s2){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsernanme(s1);
        user.setPassword(s2);
        mv.setViewName("display");
        mv.addObject("result",s1);
        return mv;
    }
}

