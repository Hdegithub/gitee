package com.learnjsp.web;

import com.learnjsp.pojo.Brand;
import com.learnjsp.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteServlet.class);
    private BrandService brandService = new BrandService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        LOGGER.info("service : ", id);
        if (id == null || "".equals(id.trim())) {
            return;
        }
        int i = brandService.delBrand(Integer.parseInt(id));
        req.getRequestDispatcher("/selectall").forward(req, resp);
    }

}
