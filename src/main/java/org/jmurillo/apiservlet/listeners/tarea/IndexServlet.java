package org.jmurillo.apiservlet.listeners.tarea;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String nombre = (String) req.getAttribute("nombreCompleto");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tarea 7 Listener</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tarea 7 Listener!</h1>");

            if (nombre != null) {
                out.println("<p>Mi nombre es: " + nombre + "</p>");
            } else {
                out.println("<p>El atributo 'nombreCompleto' no fue encontrado en la petición.</p>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}
