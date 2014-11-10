package kata4;

import java.sql.Connection;
import java.sql.DriverManager;

public class Kata4 {

    public static void main(String[] args){
        Connection connection = createConnection("people.db");
    }

    private static Connection createConnection(String peopledb) {
        DriverManager.registerDriver(new org.sqlite.JDBC());
    }
    
}
