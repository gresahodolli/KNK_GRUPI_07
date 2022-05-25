package Helpers;

import java.sql.*;

public class DBConnection {
    private static Connection dbConnection;

    private final static String host="localhost:8080";
    private final static String dbName="sistemiautobuseve";
    private final static String username="root";
    private final static String password="";

    public static Connection getConnection(){
        if(dbConnection==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                dbConnection=DriverManager.getConnection("jdbc:mysql://"+host+"/"+dbName+"?useSSL=false&allowPublicKeyRetrieval=true",username,password);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return dbConnection;
    }
}