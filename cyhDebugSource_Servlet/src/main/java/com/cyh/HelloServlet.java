package com.cyh;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author CYH
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("HelloServlet constructor()...");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("HelloServlet init()...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException,
                                                                 IOException {
        System.out.println("HelloServlet service()...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("HelloServlet destroy()...");
    }
}
