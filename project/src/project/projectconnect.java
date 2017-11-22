/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author 1205088
 */
import java.sql.*;
import javax.swing.*;
public class projectconnect {
    Connection conn=null;
    public static Connection ConnecrDb(){

        try{
            Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\1205088\\Documents\\NetBeansProjects\\project\\projectschool.sqlite");
            Connection conn = DriverManager.getConnection("jdbc:sqlite::resource:projectschool.sqlite");
           // JOptionPane.showMessageDialog(null,"Connection Established");
            return conn;

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
