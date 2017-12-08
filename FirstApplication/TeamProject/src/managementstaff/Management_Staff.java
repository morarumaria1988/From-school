
package managementstaff;

import managementstaff.Repository;
import managementstaff.UI;


public class Management_Staff {
    public static void main(String[] args) {
        SwitchChoices hC= new SwitchChoices();
        Repository.initial();
        int choice= UI.mainMenu();
        if (choice!=3)
       hC.switch_ChoiceMainMenu(choice);
    }
}
