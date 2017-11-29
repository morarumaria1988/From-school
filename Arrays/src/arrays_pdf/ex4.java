package arrays_pdf;

import java.util.Arrays;
import java.util.*;

public class ex4 {

    public static void main(String[] args) {
        System.out.println(getMissingNum(new Integer[]{1, 2, 10, 5, 16}));
    }

  /*  //with lists:
    public static String getMissingNum(Integer[] arr){
      String result="";
      List<Integer> larr=Arrays.asList(arr);
        for (int i = Collections.min(larr); i <= Collections.max(larr); i++) {
            if(!larr.contains(i))
                result+=i+" ";
        }
        return result;  
    }*/
    
  //with arrays:
    private static String getMissingNum(Integer[] arr) {
        String result="";
       int min = 0, max = 0;
    //  int min=arr[0],max=arr[0];
       for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
       /* for (Integer num : arr) {
            if(num<min) min=num;
            if(num>max) max=num;
        }*/
        for (int i = arr[min]; i <= arr[max]; i++) {
            //for (int i = min; i <= max; i++) {
          boolean  is = false;
            for (Integer num : arr) {
                if (num == i) {
                    is = true;
                    break;
                }
            }
if(!is) result+=i+" ";
        }
return result;
    }    
}
    
