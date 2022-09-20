package com.jdbc;

import java.sql.*;

public class EjemploJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cafe?servertimezone=UTC";
        String username = "root";
        String password = "";


        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM empleados");

            System.out.println("conexión OK");

            while(resultSet.next()){
                System.out.println(resultSet.getString("id_empleado") + "" + " | " + resultSet.getString("nombre"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }


    }

}
