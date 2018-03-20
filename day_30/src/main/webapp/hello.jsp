<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hello</title>
</head>
<body>

<%
    Date date = new Date();
    System.out.println("-->" + date);
%>

<%
    String str = date.toString();
    System.out.println("data.toString(): " + str);

    //没有声明就可以使用的对象
    String name = request.getParameter("name");
    System.out.println("request.getParameter(\"name\"): " + name);

    System.out.println("response instanceof HttpServletResponse: " + (response instanceof HttpServletResponse));

    ServletRequest servletRequest = pageContext.getRequest();
    System.out.println("servletRequest == request: " + (servletRequest == request));

    System.out.println("session.getId(): " + session.getId());

    System.out.println("application.getInitParameter(\"password\"): " + application.getInitParameter("password"));

    System.out.println("config.getInitParameter(\"test\"): " + config.getInitParameter("test"));

    out.println("request.getParameter(\"name\"): " + request.getParameter("name"));
    out.println("<br><br>");
    out.println("application.getInitParameter(\"password\"): " + application.getInitParameter("password"));
    out.println("<br><br>");
    out.println("this: " + this);
    out.println("<br><br>");
    out.println("page: " + page);
%>

</body>
</html>