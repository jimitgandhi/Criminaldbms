
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Connect {
    
    public static void main(String[] args) throws IllegalAccessException,InstantiationException,ClassNotFoundException{
        Connection conn = null;
        PreparedStatement pst;
        String sql = "INSERT INTO `citizen` VALUES (5,0987654,'pranavgor@gmail.com','Pranav','Gor','qqwer','asgduiajsfkj');";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criminaldatabase?autoReconnect=true&useSSL=false","root","pass@123");
            if(conn!=null){
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                System.out.println("connected to db successfully");
                pst = conn.prepareStatement(sql);
                int status = pst.executeUpdate();
                if(status != 0){
                    System.out.println(" Badhai ho ");
                }
            }
            
        }catch(SQLException e){
            System.out.println("Connection failed due to :- "+e);
        }
        
    }
}
