package demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 78289
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        System.out.println("doGet()");
        PrintWriter writer = resp.getWriter();
        writer.write("<a href=\"/page/404.html\">点击打开百度<a>");
        writer.close();

//        jdbc:mysql://localhost:3306/edu1?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf-8&autoReconnect=true

    }

}
