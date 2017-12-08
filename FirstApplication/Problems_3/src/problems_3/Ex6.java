
package problems_3;

public class Ex6 {
    public static void main(String[] args) {
        printPrimeNrUpTo(100);              
}
    public static void printPrimeNrUpTo(int x){
        int primeCounter=1;
        for (int i = 1; primeCounter <= x; i++) {
            if(ifPrimeNr(i))
            {printNumber(i);
            primeCounter++;}
        }
//int i=1;
//int primeCounter=1;
//while(primeCounter<=x){
//    if(ifPrimeNr(i))
//            {printNumber(i);
//            primeCounter++;}
//    i++;
//}
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
    

