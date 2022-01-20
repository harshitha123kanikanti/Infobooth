package db;
import java.sql.*;
public class TestDbConnection {

	
	public static void main(String[] args) {
		Connection mycon= DbConnection.getConnection();
    
        if(mycon!=null) {
            System.out.println("Db connected");
        } else {
            System.out.println("Db not connected");
        }
	}
	
}