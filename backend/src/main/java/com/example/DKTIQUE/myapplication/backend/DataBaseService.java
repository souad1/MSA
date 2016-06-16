package com.example.DKTIQUE.myapplication.backend;



import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DKTIQUE on 02/05/2016.
 */
public class DataBaseService {


    public static final String className = "com.mysql.jdbc.Driver";
    public static final String chaine = "jdbc:mysql://localhost:3306/msa";
    public static final String username = "root";
    public static final String password = "";

    public Connection connecter() {

        Connection con = null;
        try {
            Class.forName(className);
            con = DriverManager.getConnection(chaine, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public List<Prospect> getProspects(){
        List<Prospect> liste=new ArrayList<>() ;
        String query = "select * from prospect";
        Connection conn= connecter();
        try{
            Statement st = (Statement) conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            if (rs.first()) {
                while (!rs.isAfterLast()) {

                    Prospect prospect = new Prospect();
                    prospect.setNom(rs.getString(2));
                    prospect.setPrenom(rs.getString(3));
                   // prospect.setDateNaissance(rs.getDate(3));

                    liste.add(prospect);
                    rs.next();

                }

            }




        }catch(SQLException e){e.printStackTrace();}

        return  liste;
    }



    public int addProspect (Prospect prospect) {
        Connection conn = connecter();
        String query = "insert into prospect value(?,?,?,?,?,?)";
        PreparedStatement st = null;
        int i = -1;

        try {

            st = conn.prepareStatement(query);
            st.setString(1,prospect.getId());
            st.setString(2, prospect.getNom());
            st.setString(3, prospect.getPrenom());
            //String datetime = dateFormat.format(date);
           // SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
         //   st.setString(4, dateformat.format(prospect.getDateNaissance()));
            st.setString(4, prospect.getDateNaissance());
            st.setString(5, prospect.getNumTelephone());
            st.setString(6,prospect.getNumpoche());


            i = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (st != null)
                st.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
