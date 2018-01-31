package com.atguigu.javaweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 针对于 HTTP 协议定义的一个 Servlet 基类
 */
public class MyHttpServlet extends MyGenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        if (req instanceof HttpServletRequest) {
            HttpServletRequest request = (HttpServletRequest) req;
            if (resp instanceof HttpServletResponse) {
                HttpServletResponse response = (HttpServletResponse) resp;
                service(request, response);
            }
        }
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        if ("GET".equalsIgnoreCase(method)) {
            doGet(request, response);
        } else if ("POST".equalsIgnoreCase(method)) {
            doPost(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}


}
