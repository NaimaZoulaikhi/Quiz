/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connecter;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

import java.sql.*;

public class ConnectionProvided {
    
    public static Connection getCon(){
    
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver oki");
            String url="jdbc:mysql://localhost:3306/myquiz";
            String user="root";
            String passwd="root";
            com.mysql.jdbc.Connection cnx;
            cnx = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, passwd);
            System.out.println("connection bien Etablir");
            return cnx;
            
        
        }catch(Exception e){
            e.printStackTrace();
            return null;
        
        }
    
    }
     
    public static void main(String args[]){
        Connection con=getCon();
    
    }
    

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String insert_into_question_values) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
