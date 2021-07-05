package com.puppy.learnjava.controller;

import com.puppy.learnjava.framework.GetMapping;
import com.puppy.learnjava.framework.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author 袁吉吉
 */
public class IndexController {
    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        return null;
    }

    @GetMapping("/hello")
    public ModelAndView hello(String name) {
        return null;
    }


}
