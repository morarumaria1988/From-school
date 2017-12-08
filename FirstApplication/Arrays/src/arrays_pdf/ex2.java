package arrays_pdf;

import java.util.Arrays;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(isSumOfTensThirty(new Integer[]{10,20,10,15,10}));
    }
/*
    private static boolean isSumOfTensThirty(Integer[] arr) {
//boolean is=false;
int sum=0;
        for (Integer integer : arr) {
            if (integer==10)
                sum+=10;
        }
//        if (sum==30)
//            is=true;
//return is;

return(sum==30)?true:false;

    }
    */
    private static boolean isSumOfTensThirty(Integer[] arr) {
        int sum=0;
        List<Integer> list=Arrays.asList(arr);
        for (Integer integer : list) {
            if(integer.equals(10))
                sum+=10;
        }
         return sum==30?true:false;
    }
}
