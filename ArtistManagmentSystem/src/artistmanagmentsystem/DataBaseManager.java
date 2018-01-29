package artistmanagmentsystem;

import artistmanagmentsystem.util.SqlStatements;
import module.Artist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Manage the data base in different ways.
 * Insert, update, delete, search.
 * 
 * @author Mariela Tanya Maria
 */
public class DataBaseManager {

    private Connection connection;

    //Variables with the necessary information about the connection whit the database
    final static String url = "jdbc:derby://localhost:1527/ArtistManagmentSystem";
    final static String user = "root";
    final static String password = "root";

    /**
     * Constructor to create a new connection with the database
     * @throws SQLException 
     */
    public DataBaseManager() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    //TODO Every PrepareStatement should be manege with try-with-resource
    void addArtist(Artist artist) throws SQLException {
        
        PreparedStatement prepareAddStatement = connection.prepareStatement(SqlStatements.ADD_STATEMENT);

        prepareAddStatement.setString(1, artist.getName());
        prepareAddStatement.setString(2, artist.getLasName());
        prepareAddStatement.setInt(3, artist.getAge());

        prepareAddStatement.execute();

        prepareAddStatement.close();
    }

    public boolean updateArtistByName(Artist artist, String newName) throws SQLException {

        PreparedStatement prepareUpdateStatement = connection.prepareStatement(SqlStatements.UPDATE_NAME_STATEMENT);

        prepareUpdateStatement.setString(1, newName);
        prepareUpdateStatement.setInt(2, artist.getId());
        
        int rs = prepareUpdateStatement.executeUpdate();
        prepareUpdateStatement.close();
        return checkResultSet(rs);
    }

    private boolean checkResultSet(int rs) {
        if (rs >=1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateArtistByLastName(Artist artist, String newLastName) throws SQLException {
        PreparedStatement prepareUpdateStatement = connection.prepareStatement(SqlStatements.UPDATE_LAST_NAME_STATEMENT);

        prepareUpdateStatement.setString(1, newLastName);
        prepareUpdateStatement.setInt(2, artist.getId());
        int rs = prepareUpdateStatement.executeUpdate();
        prepareUpdateStatement.close();
        return checkResultSet(rs);
    }

    public boolean updateArtistByAge(Artist artist, int newAge) throws SQLException {
        PreparedStatement prepareUpdateStatement = connection.prepareStatement(SqlStatements.UPDATE_AGE_STATEMENT);

        prepareUpdateStatement.setInt(1, newAge);
        prepareUpdateStatement.setInt(2, artist.getId());

        int rs = prepareUpdateStatement.executeUpdate();
        prepareUpdateStatement.close();
        return checkResultSet(rs);
    }

    public List<Artist> showAll() throws SQLException {
        List<Artist> list = new ArrayList<>();
        Statement showStatement = connection.createStatement();
        ResultSet rs = showStatement.executeQuery(SqlStatements.SHOW_ALL_STATEMENT);
        while (rs.next()) {
            int id = rs.getInt(ID);
            String name = rs.getString(NAME);
            String lastName = rs.getString(LAST_NAME);
            int age = rs.getInt(AGE);

            Artist a = new Artist(id, name, lastName, age);
            list.add(a);
        }
        rs.close();
        return list;
    }

    public Artist findArtistByID(int id) throws SQLException {
        Artist artist;
        PreparedStatement preparedFindStatement = connection.prepareStatement(SqlStatements.FIND_BY_ID_STATEMENT);
        preparedFindStatement.setInt(1, id);

        ResultSet rs = preparedFindStatement.executeQuery();
        if (rs.next()) {
            String name = rs.getString(NAME);
            String lastName = rs.getString(LAST_NAME);
            int age = rs.getInt(AGE);
            artist = new Artist(id, name, lastName, age);
            preparedFindStatement.close();
            return artist;
        } else {
            return null;
        }
    }
    
    public List<Artist> findArtistByName(String nameToBeFound) throws SQLException {
        List<Artist> artists = new ArrayList<>();
        PreparedStatement preparedFindStatement = connection.prepareStatement(SqlStatements.FIND_BY_NAME_STATEMENT);
        preparedFindStatement.setString(1, nameToBeFound);

        ResultSet rs = preparedFindStatement.executeQuery();
        while (rs.next()) {
            Artist artist;
            int id = rs.getInt(ID);
            String name = rs.getString(NAME);
            String lastName = rs.getString(LAST_NAME);
            int age = rs.getInt(AGE);
            artist = new Artist(id, name, lastName, age);
            artists.add(artist);
        }
        preparedFindStatement.close();
        return artists;
    }
    private static final String AGE = "age";
    private static final String LAST_NAME = "last_name";
    private static final String NAME = "name";
    private static final String ID = "id";

    public List<Artist> findArtistByLastName(String lastNameToBeFound) throws SQLException {
        List<Artist> artists = new ArrayList<>();
        PreparedStatement preparedFindStatement = connection.prepareStatement(SqlStatements.FIND_BY_LAST_NAME_STATEMENT);
        preparedFindStatement.setString(1, lastNameToBeFound);

        ResultSet rs = preparedFindStatement.executeQuery();
        while (rs.next()) {
            Artist artist;
            int id = rs.getInt(ID);
            String name = rs.getString(NAME);
            String lastName = rs.getString(LAST_NAME);
            int age = rs.getInt(AGE);
            artist = new Artist(id, name, lastName, age);
            artists.add(artist);
        }
        preparedFindStatement.close();
        return artists;
    }
    
    public List<Artist> findArtistByAge(int ageToBeFound) throws SQLException {
        List<Artist> artists = new ArrayList<>();
        PreparedStatement preparedFindStatement = connection.prepareStatement(SqlStatements.FIND_BY_AGE_STATEMENT);
        preparedFindStatement.setInt(1, ageToBeFound);

        ResultSet rs = preparedFindStatement.executeQuery();
        while (rs.next()) {
            Artist artist;
            int id = rs.getInt(ID);
            String name = rs.getString(NAME);
            String lastName = rs.getString(LAST_NAME);
            int age = rs.getInt(AGE);
            artist = new Artist(id, name, lastName, age);
            artists.add(artist);
        }
        preparedFindStatement.close();
        return artists;
    }

    boolean deleteArtistByID(int id) throws SQLException {
        PreparedStatement preparedDeleteStatement = connection.prepareStatement(SqlStatements.DELETE_BY_ID_STATEMENT);
        preparedDeleteStatement.setInt(1, id);
        int rs = preparedDeleteStatement.executeUpdate();
        preparedDeleteStatement.close();
        return checkResultSet(rs);
    }
    
    boolean deleteArtistByName(String name) throws SQLException {
        PreparedStatement preparedDeleteStatement = connection.prepareStatement(SqlStatements.DELETE_BY_NAME_STATEMENT);
        preparedDeleteStatement.setString(1, name);
        int rs = preparedDeleteStatement.executeUpdate();
        preparedDeleteStatement.close();
        return checkResultSet(rs);
    }
    boolean deleteArtistByLastName(String lastName) throws SQLException {
        PreparedStatement preparedDeleteStatement = connection.prepareStatement(SqlStatements.DELETE_BY_LAST_NAME_STATEMENT);
        preparedDeleteStatement.setString(1, lastName);
        int rs = preparedDeleteStatement.executeUpdate();
        preparedDeleteStatement.close();
        return checkResultSet(rs);
    }
    boolean deleteArtistByAge(int age) throws SQLException {
        PreparedStatement preparedDeleteStatement = connection.prepareStatement(SqlStatements.DELETE_BY_AGE_STATEMENT);
        preparedDeleteStatement.setInt(1, age);
        int rs = preparedDeleteStatement.executeUpdate();
        preparedDeleteStatement.close();
        return checkResultSet(rs);
    }
}
