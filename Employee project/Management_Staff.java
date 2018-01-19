
package management_staff;

import management_staff.Repository;


public class Management_Staff {
    public static void main(String[] args) {
        SwitchChoices hC= new SwitchChoices();
        Repository.initial();
        int choice= UI.mainMenu();
      
        while (choice!=3) {
       hC.switch_ChoiceMainMenu(choice);
       choice= UI.mainMenu();
    }
    }
}
