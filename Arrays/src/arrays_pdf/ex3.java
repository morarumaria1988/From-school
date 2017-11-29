
package arrays_pdf;

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        System.out.println(isEqual(new Integer[]{10, 20, 10, 15, 1}, new Integer[]{10, 20, 10, 15}));
    }

   /* private static boolean isEqual(Integer[] arr1, Integer[] arr2) {
        // boolean  isEqual=false;   
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            //  isEqual=false;
        } else 
            return false;
        
        // else isEqual= false;
        //return isEqual; 
        return true;
    }*/
    private static boolean isEqual(Integer[] arr1, Integer[] arr2){
        List<Integer> list1=Arrays.asList(arr1);
        List<Integer> list2=Arrays.asList(arr2);
     if(  list1.equals(list2))
        return true;
else        return false;
    }
}
