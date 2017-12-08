package managementstaff;

import managementstaff.UI;

public class SwitchChoices {

    int x = 0;

    public void switch_ChoiceMainMenu(int ch) {
        switch (ch) {

            case 1:  //(General Info menu)
                while (x != 6) { //(x!=6) to go back to the main menu ("6. Go to main menu ")
                    //IE. stop this loop while 8 
                    //call generalInfo() to display the (General Info menu) and get the user choice in (x)
                    x = UI.generalInfo();
                    // process the use choice 
                    switch_GeneralInfoList(x);
                }
                break;

            case 2://(static info menu)

                while (x != 8) {  //(x!=7) to go back to the main menu ("7.Go to main menu ")
                    //IE. stop this loop while 7
                    //call statisticInfo() to display the (Statistic Menu) and get the user choice in (x)
                    x = UI.statisticInfo();
                    // process the use choice
                    switch_StatisticlInfoList(x);
                }
                break;

            case 3:
                // 3 is for exit on the main menu
                //System.out.println("Thank You Good Bye");

                break;

            default:
                System.out.println("Wrong Choice! Try a Number between 1 to 3 ");
                UI.mainMenu();
                break;
        }
    }

    MethodsInPlace dM = new MethodsInPlace();

    public void switch_GeneralInfoList(int ch) {

        switch (ch) {

            case 1:
                dM.addEmployeebyDepatament();
                break;
            case 2:
                System.out.println("Enter Employee ID you want to Remove");
                dM.removeEmplById(UI.readNumber());
                break;
            case 3:
                System.out.println("Enter Employee ID you want to Find");
                dM.findEmployeeById(UI.readNumber());
                break;
            case 4:
                System.out.println("Enter The Employee ID");
                dM.updateEmployees(UI.readNumber());
                break;
            case 5:
                dM.showAllEmployees();
                break;

            case 6:
                switch_ChoiceMainMenu(UI.mainMenu());
                break;
            default:
                System.out.println("No such choice! ****TRY AGAIN*** ");
                switch_GeneralInfoList(UI.generalInfo());
        }

    }

    public void switch_StatisticlInfoList(int ch) {

        switch (ch) {
            case 1:
                System.out.println("Enter employee age you want to remove ");
                dM.removeEmplByAge(UI.readNumber());
                break;
            case 2:
                //System.out.println("Enter employee by Departament you want to show it");
                dM.getAllEmployeesByDepartment(UI.chekClass());
                break;
            case 3:
                dM.avrageSalaryForAll();
                break;
            case 4:
                dM.avrageSalaryByDepartment();
                break;
            case 5:
                dM.procentageEmployeeByDepartment();
                break;
            case 6:
                dM.totalSalaryForEmployee();
                break;
            case 7:
                dM.showAllEmployees();
            case 8:
                switch_ChoiceMainMenu(UI.mainMenu());
                break;
            default:
                System.out.println("No such choice! ****TRY AGAIN*** ");
                switch_StatisticlInfoList(UI.statisticInfo());
        }
    }

}
