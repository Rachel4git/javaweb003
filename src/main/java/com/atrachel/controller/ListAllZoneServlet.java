package com.atrachel.controller;


import com.atrachel.model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by hd48552 on 2018/5/8.
 */
public class ListAllZoneServlet extends  HttpServlet {

    @Override
    public  void  doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ZoneDAO zoneDAO = new ZoneDAO();
        List<Zone> allZone = zoneDAO.getAllZone();
        request.setAttribute("allZone",allZone);
        request.getRequestDispatcher("ZoneJSP.jsp").forward(request,response);
    }




}
