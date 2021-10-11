package jspservlet.ch03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {
        "/OurServlet",
        "/today"
},
        initParams = {
                @WebInitParam(name = "init-param", value = "init-value")
        },
        name = "OurServlet", value = "/OurServlet")

public class OurServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        System.out.println("init : " + config.getInitParameter("init-param"));
    }

    public OurServlet() {
        System.out.println("constructor : ");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service : ");
        super.service(req, resp);
    }

}
