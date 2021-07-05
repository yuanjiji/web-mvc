package com.puppy.learnjava.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 袁吉吉
 */
public abstract class AbstractDispatcher {
    /**
     * 调用具体方法
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     * @throws ReflectiveOperationException
     */
    public abstract ModelAndView invoke(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ReflectiveOperationException;
}
