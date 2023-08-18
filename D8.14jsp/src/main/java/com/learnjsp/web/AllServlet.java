package com.learnjsp.web;
import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/selectall")
public class AllServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object uname = session.getAttribute("uname");
        if (uname == null) {
            //说明用户没有登陆
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }

        List<Brand> allBrands = brandService.getAllBrands();

        req.setAttribute("myBrands", allBrands);

        req.getRequestDispatcher("/jstl-foreach.jsp").forward(req, resp);
    }
}
