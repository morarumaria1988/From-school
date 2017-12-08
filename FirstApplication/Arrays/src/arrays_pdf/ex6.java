package arrays_pdf;

import java.util.*;

public class ex6 {

    public static void main(String[] args) {
        pair(new Integer[] {2, 7, 4, -5, 11, 5, 20}, 15); //Integer or int
    }

    private static void pair(Integer[] arr, int sum) { //Integer or int
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sum)
                    System.out.println(arr[i]+" + "+arr[j]+"="+(arr[i]+arr[j]));
            }
            
        }
    }
    

   
    
}
