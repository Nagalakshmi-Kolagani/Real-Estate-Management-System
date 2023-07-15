package RealEstateManagementSystem;
import java.sql.*;

    public class DatabaseConnection{
        public Connection c;
        public DatabaseConnection(){

            try{
                //Database Connection
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/real_estate_management_system","root","root");//returns a connection to the url
                System.out.println("Connected Successfully!");
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }

