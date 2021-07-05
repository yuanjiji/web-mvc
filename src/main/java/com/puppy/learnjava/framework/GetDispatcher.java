package com.puppy.learnjava.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class GetDispatcher extends AbstractDispatcher {

    final Object instance;

    final Method method;

    final String[] parameterNames;

    final Class<?>[] paratmeterClasses;

    public GetDispatcher(Object instance, Method method, String[] parameterNames, Class<?>[] paratmeterClasses) {
        this.instance = instance;
        this.method = method;
        this.parameterNames = parameterNames;
        this.paratmeterClasses = paratmeterClasses;
    }

    @Override
    public ModelAndView invoke(HttpServletRequest request, HttpServletResponse response) throws IOException, ReflectiveOperationException {
        return null;
    }
}
