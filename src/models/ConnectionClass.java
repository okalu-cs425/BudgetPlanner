package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    public Connection connection;

    public Connection getConnection(){

        String dbName = "budget_planner_db";
        String userName = "budget_planner_db_sys";
        String password = "test123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName + "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
