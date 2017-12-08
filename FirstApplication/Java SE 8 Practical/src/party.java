  
   import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class party {

    public static void main(String[] args) {
       String[] his={"Zack", "Arvid","Wilhem","Anna","Adam","Albert","August","Doris"};
       String[] hers={"Stefan", "Sara","Sune","Hugo","Lotta","Anna","Adam","Albert","Annton"};
       String[] Zacks={"Hugo", "Albert","Arvid","Anna"};
       
       ArrayList<String> hisFriends=new ArrayList<>(Arrays.asList(his));
       ArrayList<String> herFriends=new ArrayList<>(Arrays.asList(hers));
       ArrayList<String> zacksFriends=new ArrayList<>(Arrays.asList(Zacks));
    //a. Invite all her and his friends to a party the list shouldn't contain doublets
    HashSet<String> party=new HashSet<> (hisFriends);
    party.addAll(herFriends);
        
     //   b. Zack is not invited remove him 
     party.remove("Zack");
     
      //c. Zacks friend is not invited either, remove them
      party.removeAll(zacksFriends);
       
}
}