
package problems_3;


public class Ex5 {

    public static void main(String[] args) {
        printPrimeNrUpTo(100);              
}
    public static void printPrimeNrUpTo(int x){
        for (int i = 1; i <= x; i++) {
            if(ifPrimeNr(i))
                printNumber(i);
        }
    }
    public static boolean ifPrimeNr(int x){
        for (int i = 2; i < x; i++) {
            if(x%i==0)
                return false;
                    }
        return true;
    }
    public static void printNumber(int i){
        System.out.print(i+" ");
    }
}
