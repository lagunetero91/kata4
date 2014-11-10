package kata4;

import java.sql.Connection;

public class DataBasePersonLoader implements PersonLoader {
    private final Connection connection;

    public DataBasePersonLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Person[] load() {
        
    }
    
}
