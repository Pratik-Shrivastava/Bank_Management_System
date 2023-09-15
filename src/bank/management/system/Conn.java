package bank.management.system;
/*
There are five steps in JDBC connectivity.
1. Register the Driver
2. Create connection
3. Create Statement
4. Execute Query
5. Close Connection
 */


import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            //Register the driver
            //We do not need to register the driver explicitly.
           //Class.forName(com.mysql.cj.jdbc.Driver);

            //Create connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "SohitPratik@7613");

            //create statement
            s = c.createStatement();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
