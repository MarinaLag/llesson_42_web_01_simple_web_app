package by.itClass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "oneParameterServlet", urlPatterns = "/oneParam") // говорим веб сервису на который мы отправляем
// oneParameterServlet -имя  /oneParam - паттерн
public class OneParameterServlet extends HttpServlet {
    // отправляем запрос из браузера

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // -ОДИН ПАРАМЕТР
        String param = req.getParameter("parame"); // ВСЕГДА получаем строку(то что придет после ? знака)
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter(); // поток в браузер
        writer.write("<h1>" + param + "</h1>");

         // http://localhost:8080/oneParam?parame=Hello
    }


}
