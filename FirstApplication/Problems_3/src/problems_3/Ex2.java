
package problems_3;

import java.util.Scanner;

public class Ex2 {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
           System.out.println("Give two numbers in the interval 25 to 75");
           int firstNumber=getInput("Input the first number : ");
           int secondNumber=getInput("Input the second number : ");
           System.out.println("Result: "+checkIfSameDigit(firstNumber, secondNumber));

    }
    public static boolean checkIfSameDigit(int a, int b){
        String sA=Integer.toString(a);
        String sB=Integer.toString(b);
        for (int i = 0; i < sA.length(); i++) {
            char cA=sA.charAt(i);
            for (int j = 0; j < sB.length(); j++) {
                char cB=sB.charAt(j);
                if( cA== cB)
                return true;
            }
        }
        return false;
    }
    
    public static int getInput(String s){
       
        int x=0;
        System.out.print(s);
        x=sc.nextInt();
        while(!ifInBetween(x)){
            System.out.println("Not in the interval, input another number: ");
             x=sc.nextInt();
        }
        return x;
    }
    public static boolean ifInBetween(int a){
        if (a>=25&&a<=75)
            return true;
        else return false;
    }
}
