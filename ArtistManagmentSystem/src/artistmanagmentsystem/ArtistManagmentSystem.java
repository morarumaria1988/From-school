package artistmanagmentsystem;

import artistmanagmentsystem.util.ArtistFormatter;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import module.Artist;

/**
 * Manege the user interface, and the interaction with the DataBaseManagement
 * @author marie tanya maria
 */
public class ArtistManagmentSystem {
    private static Scanner sc;
    private static DataBaseManager dbm;
    private static final String NAME = "name";
    private static final String LAST_NAME = "last name";
    private static final String ID = "id";
    private static final String AGE = "age";

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) throws SQLException {
        sc = new Scanner(System.in);
        try{
            dbm = new DataBaseManager();
            mainMenu();        
        }catch(SQLException e){
            System.err.print("Connection not not Succesfull...");
        }
    }  
    
    public static void mainMenu() throws SQLException {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Find");
            System.out.println("5. Show All");
            System.out.println("0. Exit");
            System.out.println("What would you like to do: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addArtist();
                    break;
                case 2:
                    menuDelete();
                    break;
                case 3:
                    menuUpdate();
                    break;
                case 4:
                    menuFind();
                    break;
                case 5:
                    showAll();
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void addArtist() throws SQLException {
        System.out.println("Insert the information for the Artist:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        Artist artist = new Artist(name,lastName,age);
        dbm.addArtist(artist);
    }
    
    public static void menuUpdate() throws SQLException{
        
        System.out.println("Artists ");
        List<Artist> artists = dbm.showAll();
        System.out.println(ArtistFormatter.format(artists));
        System.out.println("Insert the ID of the Artist you want to update information:");
        int id = sc.nextInt();
        sc.nextLine();
        Artist artist = dbm.findArtistByID(id);
        System.out.println(ArtistFormatter.format(artist));
        
        System.out.println("Menu Update");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. By Name");
            System.out.println("2. By Last Name");
            System.out.println("3. By Age");
            System.out.println("0. Go Back Main Menu.");
            System.out.println("What would you like to do: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    updateByName(artist);
                    break;
                case 2:
                    updateByLastName(artist); 
                    break;
                case 3:
                    updateByAge(artist);
                    break;
                default:
                    break;
            }
        }        
    }
    
    public static String getStringInformation(String parameter){
        System.out.println("Insert " + parameter + ": ");
        String str = sc.nextLine();
        return str;
    }
    public static int getIntInformation(String parameter){
        System.out.println("Insert " + parameter + ": ");
        int age = sc.nextInt();
        sc.nextLine();
        return age;
    }
    private static void checkInformation(boolean check){
        if(check){
            System.out.println("Transaction succesfull!!!!!");
        }else{
            System.out.println("Something went wrong!!!!!");
        }
    }
    public static void updateByName(Artist artist) throws SQLException {
        String name = getStringInformation(NAME);
        checkInformation(dbm.updateArtistByName(artist, name));
    }
    
    public static void updateByLastName(Artist artist) throws SQLException {
        String lastName = getStringInformation(LAST_NAME);
        checkInformation(dbm.updateArtistByLastName(artist, lastName));
    }
    
    public static void updateByAge(Artist artist) throws SQLException {
        int age = getIntInformation(AGE);       
        checkInformation(dbm.updateArtistByAge(artist, age));        
    }

    private static void menuFind() throws SQLException {
        System.out.println("Menu Find");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. By ID");
            System.out.println("2. By Name");
            System.out.println("3. By Last Name");
            System.out.println("4. By Age");
            System.out.println("0. Go Back Main Menu.");
            System.out.println("What would you like to do: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    int id = getIntInformation(ID);
                    Artist artist = dbm.findArtistByID(id);
                    System.out.println(ArtistFormatter.format(artist));
                    break;
                case 2:
                    String name = getStringInformation(NAME);
                    List<Artist> artists = dbm.findArtistByName(name);
                    System.out.println(ArtistFormatter.format(artists));
                    break;
                case 3:
                    String lastName = getStringInformation(LAST_NAME);
                    artists = dbm.findArtistByLastName(lastName);
                    System.out.println(ArtistFormatter.format(artists));
                    break;
                case 4:
                    int age = getIntInformation(AGE);
                    artists = dbm.findArtistByAge(age);
                    System.out.println(ArtistFormatter.format(artists));
                    break;
                default:
                    break;
            }
        }        
    }

    private static void showAll() throws SQLException {
        List<Artist> artists = dbm.showAll();
        System.out.println(ArtistFormatter.format(artists));
    }

    private static void menuDelete() throws SQLException {
        System.out.println("Menu Delete");
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. By ID");
            System.out.println("2. By Name");
            System.out.println("3. By Last Name");
            System.out.println("4. By Age");
            System.out.println("0. Go Back Main Menu.");
            System.out.println("What would you like to do: ");
            choice = sc.nextInt();
            sc.nextLine();
            boolean rs;
            switch (choice) {
                case 1:
                    int id = getIntInformation(ID);
                    rs = dbm.deleteArtistByID(id);
                    checkInformation(rs);
                    break;
                case 2:
                    String name = getStringInformation(NAME);
                    rs = dbm.deleteArtistByName(name);
                    checkInformation(rs);
                    break;
                case 3:
                    String lastName = getStringInformation(LAST_NAME);
                    rs = dbm.deleteArtistByLastName(lastName);
                    checkInformation(rs);
                    break;
                case 4:
                    int age = getIntInformation(AGE);
                    rs = dbm.deleteArtistByAge(age);
                    checkInformation(rs);                  
                    break;
                default:
                    break;
            }
        }
    }
}
