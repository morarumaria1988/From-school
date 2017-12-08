package arrays_powerpoint;

import java.util.Scanner;

public class minAndMax {

    public static void main(String[] args) {
        int[] talen = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mata in " + talen.length + " tal: ");
        
        for (int i = 0; i < talen.length; i++) {
            talen[i] = sc.nextInt();
        }
        
        System.out.println("Du matade in: ");
        
        for (int i = 0; i < talen.length; i++) {
            System.out.print(talen[i] + " ");
        }

        System.out.println("\nMinsta inmatade tal är: " + hittaMin(talen)
                + "\nStörsta inmatade tal är: " + hittaMax(talen));
    }

    public static int hittaMin(int[] x) {
        int min = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] < x[min]) {
                min = i;
            }
        }
        return x[min];
    }

    public static int hittaMax(int[] talen) {
        int max = 0;
        for (int i = 1; i < talen.length; i++) {
            if (talen[i] > talen[max]) {
                max = i;
            }
        }
        return talen[max];
    }
}
