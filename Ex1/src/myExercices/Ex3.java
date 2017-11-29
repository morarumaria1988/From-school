package myExercices;


public class Ex3 {

    public static void main(String[] args) {
        int i;
        System.out.println("Divided by 3: ");
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n\n");
       
        System.out.println("Divided by 5: ");
        for (i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
        System.out.println("Divided by 3 & 5: ");
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
