package artistmanagmentsystem.util;

/**
 * Class utilitarian for create sql query as Strings 
 * @author marie
 */

public class SqlStatements {
    
    public final static String ADD_STATEMENT = "INSERT into artist (name,last_name,age) values(?,?,?)";
    public final static String DELETE_BY_ID_STATEMENT = "DELETE from artist where id = ?";
    public final static String DELETE_BY_NAME_STATEMENT = "DELETE from artist where name = ?";
    public final static String DELETE_BY_LAST_NAME_STATEMENT = "DELETE from artist where last_name = ?";
    public final static String DELETE_BY_AGE_STATEMENT = "DELETE from artist where age = ?";
    public final static String UPDATE_NAME_STATEMENT = "UPDATE artist SET name = ? WHERE id = ?";
    public final static String UPDATE_LAST_NAME_STATEMENT = "UPDATE artist SET last_name = ? WHERE id = ?";
    public final static String UPDATE_AGE_STATEMENT = "UPDATE artist SET age = ? WHERE id = ?";
    public final static String SHOW_ALL_STATEMENT = "SELECT * from artist";
    public final static String FIND_BY_ID_STATEMENT = "SELECT id,name, last_name, age from artist where id = ?";
    public final static String FIND_BY_NAME_STATEMENT = "SELECT id,name, last_name, age from artist where name = ?";
    public final static String FIND_BY_LAST_NAME_STATEMENT = "SELECT id,name, last_name, age from artist where last_name = ?";
    public final static String FIND_BY_AGE_STATEMENT = "SELECT id,name, last_name, age from artist where age = ?";
        
}
