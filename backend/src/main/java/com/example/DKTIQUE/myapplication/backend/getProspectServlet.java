package com.example.DKTIQUE.myapplication.backend;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by DKTIQUE on 02/05/2016.
 */
public class getProspectServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List <Prospect> liste = new DataBaseService().getProspects();
        Gson gson =new Gson();
        resp.getWriter().write(gson.toJson(liste));
    }
}
