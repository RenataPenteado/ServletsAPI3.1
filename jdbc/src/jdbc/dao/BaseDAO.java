package jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO implements DAO {
    //public static final String dbUrl = "jdbc:derby:daotest";
    public static final String dbUrl = "jdbc:derby://localhost:1527/daotest";
    
    public Connection getConnection() throws DAOException {        
        try {
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new DAOException();
        }
    }
}