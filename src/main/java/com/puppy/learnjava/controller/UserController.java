package com.puppy.learnjava.controller;

import com.puppy.learnjava.bean.SignInBean;
import com.puppy.learnjava.bean.User;
import com.puppy.learnjava.framework.GetMapping;
import com.puppy.learnjava.framework.ModelAndView;
import com.puppy.learnjava.framework.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 袁吉吉
 */
public class UserController {

    private Map<String, User> userDatabase = new HashMap<String, User>() {{
        put("puppy@example.com", new User("puppy@example.com", "puppy123" , "puppy", "This is puppy"));
        put("tom@example.com", new User("tom@example.com", "tomcat", "Tom", "This is tom."));
    }};

    @GetMapping("/signin")
    public ModelAndView signin() {
        return new ModelAndView("/signin.html");
    }

    @PostMapping("/signin")
    public ModelAndView doSignIn(SignInBean bean, HttpServletResponse response, HttpSession session) throws IOException {
        User user = userDatabase.get(bean.email);
        if (user == null || !user.password.equals(bean.password)) {
            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.write("{\"error\":\"Bad email or password\"}");
            pw.flush();
        } else {
            session.setAttribute("user", user);
            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.write("{\"result\":true}");
            pw.flush();
        }
        return null;
    }

    @GetMapping("/signout")
    public ModelAndView signout(HttpSession session) {
       session.removeAttribute("user");
       return new ModelAndView("redirect:/");
    }

    @GetMapping("/usr/profile")
    public ModelAndView profile(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return new ModelAndView("redirect:/signin");
        }
        return new ModelAndView("/profile.html", "user", user);
    }
}
