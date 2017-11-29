package arrays_pdf;

import java.util.Arrays;
import static java.util.Collections.list;
import java.util.*;

public class ex5 {

    public static void main(String[] args) {

        //System.out.println(Arrays.toString((delete(new Integer[]{0, 2, 0, 5}, 0))));
        System.out.println(Arrays.toString(delete(new int[]{0, 2, 0, 5}, 0)));
    }

    
    /*private static List<Integer> delete(Integer[] arr, int i) {
           //List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        List<Integer> list = new ArrayList(Arrays.asList(arr));
        //  List<Integer> list = Arrays.asList(arr) ;!!fixed-size-->not allowed to change the size (no remove, no add)
    list.removeIf(a->a.equals(i));
        return list;
    }*/ 
    
  /*  private static Integer[] delete(Integer[] arr, int i) {
        int count = 0;
        for (Integer y : arr) {
            if (y == i) {
                count++;
            }
        }
        Integer[] result = new Integer[arr.length - count];
        int c = 0;
        for (int j = 0; j < result.length; j++) {
            if (arr[c] != i) {
                result[j] = arr[c++];
            } else {
                j--;
                c++;
            }
        }
        return result;
    }*/
    private static int[] delete(int[] arr, int i) {
        int count = 0;
        for (int y : arr) {
            if (y == i) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        int c = 0;
        for (int j = 0; j < result.length; j++) {
            if (arr[c] != i) {
                result[j] = arr[c++];
            } else {
                j--;
                c++;
            }
        }
        return result;
    }

}
