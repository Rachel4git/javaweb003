package com.atrachel.controller;

import com.atrachel.model.ZoneDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * Created by hd48552 on 2018/5/9.
 */
public class DeleteByIdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse Response){
        ZoneDAO zoneDAO =new ZoneDAO();
        zoneDAO.delete(new Integer(request.getParameter("id")));
        request.setAttribute("message","删除成功");
        try {
            Response.sendRedirect("success.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
