package com.example.DKTIQUE.myapplication.backend;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by DKTIQUE on 09/05/2016.
 */
public class AddProspectServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data;
        StringBuilder result = new StringBuilder();
        InputStream inputStream = req.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));


        while ((data = reader.readLine()) != null) {
            result.append(data);
        }

        Prospect prospect = new Gson().fromJson(result.toString(), Prospect.class);
        int i = new DataBaseService().addProspect(prospect);
        resp.getWriter().write(String.valueOf(i));
    }



}
