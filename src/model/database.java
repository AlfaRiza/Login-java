/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.datavoter;

/**
 *
 * @author ACER
 */
public class database {
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/project?user=root";
        conn = DriverManager.getConnection(url);
        stmt=conn.createStatement();
    }
    public void input(datapilih dp) throws SQLException{
        String query = "INSERT INTO `pilih`(`id_pilih`, `id_voter`, `id_calon`) VALUES ('"+dp.getId_pilih()+"','"+dp.getId_voter()+"','"+dp.getId_calon()+")";
        stmt.executeUpdate(query);
    }

    public ResultSet login() throws SQLException{
        String query = "SELECT * FROM voter";
        ArrayList<datavoter> tampil = new ArrayList<datavoter>();
        rs=stmt.executeQuery(query);
        return rs;
    }
    public ResultSet pilih() throws SQLException{
        String query = "SELECT * FROM vcalon";
        ArrayList<datacalon> tampil = new ArrayList<datacalon>();
        rs=stmt.executeQuery(query);
        return rs;
    }
    public ResultSet read() throws SQLException{
        String query = "SELECT * FROM vcalon";
        ArrayList<datacalon> tampil = new ArrayList<datacalon>();
        rs=stmt.executeQuery(query);
        return rs;
    }   
}
