package com.cyh;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author CYH
 */
public class HelloGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException,
                                                                 IOException {
        System.out.println("HelloGenericServlet service()...");
    }
}
