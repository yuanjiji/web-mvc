package com.puppy.learnjava.controller;

import com.puppy.learnjava.bean.SignInBean;
import com.puppy.learnjava.framework.GetMapping;
import com.puppy.learnjava.framework.ModelAndView;
import com.puppy.learnjava.framework.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 袁吉吉
 */
public class UserController {

    @GetMapping("/signin")
    public ModelAndView signin() {
        return null;
    }

    @PostMapping("/signin")
    public ModelAndView doSignIn(SignInBean bean, HttpServletResponse response, HttpSession session) {
        return null;
    }

    @GetMapping("/signout")
    public ModelAndView signout(HttpSession session) {
        return null;
    }

    @GetMapping("/usr/profile")
    public ModelAndView profile(HttpSession session) {
        return null;
    }
}
