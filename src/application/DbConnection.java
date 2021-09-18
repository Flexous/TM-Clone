package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
    private Connection connection;

    public DbConnection()
    {

    }    

    public Connection getConnection()
    {
        return connection;
    }

    public void open()
    {
        try 
        {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/felix/Documents/Datenbanken/TM_Clone.db");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
