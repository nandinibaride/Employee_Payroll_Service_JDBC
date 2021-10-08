package javasample.com;

import java.sql.*;
import java.util.Enumeration;
/*
 * @purpose: To create employee payroll database and check driver is loaded or not.
 * @author: Nandini.Baride
 */
public class DBDemo 
{ 
	public static void main(String[] args)
	{
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
        String userName = "root";
        String password = "Pass@0805";
        Connection connection;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } 
        catch (ClassNotFoundException e)
        {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
        listDrivers();

        try 
        {
            System.out.println("Connecting to database : " + jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection is successful" + connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	/*
	 * @purpose: To check all driver are register with JDBC.
	 */
     private static void listDrivers()
     {
        Enumeration<Driver> driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
           Driver driverClass = driverList.nextElement();
           System.out.println("  " + driverClass.getClass().getName());
      }
    }
}