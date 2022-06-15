/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nurawiguna.sesi8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author nurawiguna
 */
public class connection {

    Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/db_diskusi8";
        try {
            con = DriverManager.getConnection(url, "nura", "123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
