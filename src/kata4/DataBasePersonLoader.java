package kata4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBasePersonLoader implements PersonLoader {
    private final Connection connection;

    public DataBasePersonLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Person[] load() {
        try{
        return processQuery(connection.createStatement().executeQuery("SELECT * FROM person"));
       } catch (SQLException ex) {
           return new Person[0];
       }
        
    }

    private Person[] processQuery(ResultSet executeQuery) {
        ArrayList<Person> personList = new ArrayList<>();
        return personList.toArray(new Person[personList.size()]);
    }
    
}
