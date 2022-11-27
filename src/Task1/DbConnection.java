package Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
    Connection c;
    Statement stmt;
    DbConnection dbConnection=new DbConnection();
    private DbConnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:user.db");
            stmt = c.createStatement();
            String sql = "CREATE TABLE USER " +
                    "(ID INT PRIMARY KEY" +
                    " NAME           TEXT    " +
                    " EMAIL          TEXT    " +
                    " AGE        INT";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
    DbConnection getInstance(){
        return dbConnection;
    }
    public void save(Integer id, String name, String email, Integer age){
        try {
            System.out.println("Opened database successfully");
            String sql = "INSERT or REPLACE INTO COMPANY (NAME, EMAIL, AGE) " +
                    "VALUES ("+ id.toString()+ ", '" + name + "', '" + email + "', " + age.toString() + " );";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}
