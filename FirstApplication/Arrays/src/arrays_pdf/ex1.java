package arrays_pdf;

import java.util.Arrays;
import java.util.List;

public class ex1 {

    public static void main(String[] args) {

        System.out.println(hasElements(new Integer[]{10, 2, 1, 5}, 2, 10));

    }

    //with array
    /* private static  boolean hasElements(Integer[] arr,int a,int b){
     boolean has=false;
        for (Integer integer : arr) 
            if(integer==a)
                for (Integer integer1 : arr) 
                   if(integer1==b)
       has=true;
          return has;
      }     
     */
    
    //with lists
    private static boolean hasElements(Integer[] arr, int a, int b) {
        List<Integer> list = Arrays.asList(arr);
       if(list.contains(a)&&list.contains(b))
                        return true;
                else    return false;
    }
}
