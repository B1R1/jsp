package ua.goit.java.serverlts;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(response);
    }

    private void getResponse(HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String title = "";
        String docType = "";
        out.println(docType +
                "Hello Word");
    }
}
