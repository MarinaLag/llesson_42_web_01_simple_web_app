package by.itClass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "ArrayParameterServlet",urlPatterns = "/arrParams")
public class ArrayParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // -НЕСКОЛЬКО ПАРАМЕТРОВ
        String[] pamames = req.getParameterValues("parame");
        PrintWriter writer = resp.getWriter();
        Arrays.stream(pamames).forEach(it->writer.write("<h1>" + it + "</h1>"));

    }
}