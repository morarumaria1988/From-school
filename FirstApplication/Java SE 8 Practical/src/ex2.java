

public class ex2 {
     public static void main(String[] args) {
        showTheDay(3);
    }
  public static int showTheDay(int a){
     switch(a) {
            case 1:
                System.out.println("prints the first day of the week is Monday");
                break;
            case 2:
                System.out.println("prints the second day of the week is Tuesday");break;
            case 3:
                System.out.println("prints the third day of the week is Wensday");break;
            case 4:
                System.out.println("prints the fourth day of the week is Thursday");break;
            case 5:
                System.out.println("prints the fifth day of the week is Friday");break;
            case 6:
                System.out.println("prints the sixth day of the week is Saturday");break;
            case 7:
                System.out.println("prints the seventh day of the week is Sunday");break;
            default:
                System.out.println("Any other number: It's not a valid weekday");
           
        }
        return 0;
}
}