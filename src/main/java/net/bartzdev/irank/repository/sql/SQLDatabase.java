package net.bartzdev.irank.repository.sql;

import net.bartzdev.irank.IRankLogger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Executors;

public class SQLDatabase extends Database {
    private String host;
    private String user;
    private String password;
    private String database;
    private Integer port;

    private Connection connection;

    public SQLDatabase(String host, String user, String password, String database, Integer port) {
        this.host = host;
        this.user = user;
        this.password = password;
        this.database = database;
        this.port = port;
        this.setExecutor(Executors.newFixedThreadPool(3));
    }

    public void connect() {
        try {
            Class.forName("com.jdbc.mysql.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.user, this.password);
            IRankLogger.info("Connected to the MySQL server.");
        } catch (ClassNotFoundException e) {
            IRankLogger.warning("JDBC Driver not found.");
            IRankLogger.warning("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            IRankLogger.warning("Cannot connect to the MySQL Server.");
            IRankLogger.warning("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException e) {
            IRankLogger.warning("Cannot disconnect from the MySQL Server.");
            IRankLogger.warning("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        if (this.connection == null) {
            throw new IllegalStateException("Cannot get the connection before invoke connect() method.");
        }
        return this.connection;
    }
}
