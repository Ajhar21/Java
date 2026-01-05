import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SampleServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hi service");

        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h1><b>Hello world</b></h1>");
    }
}
