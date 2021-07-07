package com.puppy.learnjava.controller;

import com.puppy.learnjava.bean.User;
import com.puppy.learnjava.framework.GetMapping;
import com.puppy.learnjava.framework.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author 袁吉吉
 */
public class IndexController {
    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        User user = (User) session.getAttribute("user");
        return new ModelAndView("/index.html", "user", user);
    }

    @GetMapping("/hello")
    public ModelAndView hello(String name) {
        if (name == null) {
            name = "puppy";
        }
        return new ModelAndView("/hello.html", "name", name);
    }


}
