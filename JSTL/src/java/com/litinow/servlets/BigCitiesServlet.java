/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renata
 */
@WebServlet(name = "BigCitiesServlet", urlPatterns = {"/bigCities"})
public class BigCitiesServlet extends HttpServlet {

    private static final int serialVersionUID = 112233;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> capitals
                = new HashMap<String, String>();
        capitals.put("Indonesia", "Jakarta");
        capitals.put("Malaysia", "Kuala Lumpur");
        capitals.put("Thailand", "Bangkok");
        request.setAttribute("capitals", capitals);
        Map<String, String[]> bigCities
                = new HashMap<String, String[]>();
        bigCities.put("Australia", new String[]{"Sydney",
            "Melbourne", "Perth"});
        bigCities.put("New Zealand", new String[]{"Auckland",
            "Christchurch", "Wellington"});
        bigCities.put("Indonesia", new String[]{"Jakarta",
            "Surabaya", "Medan"});
        request.setAttribute("capitals", capitals);
        request.setAttribute("bigCities", bigCities);
        RequestDispatcher rd
                = request.getRequestDispatcher("/bigCities.jsp");
        rd.forward(request, response);
    }
}
