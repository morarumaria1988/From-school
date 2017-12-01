package collections;

import java.util.*;


public class ListByBinary {

    public static void main(String args[]) {
        List<String> binaryNumbers = new ArrayList<>();
        binaryNumbers.add("11");
        binaryNumbers.add("101");
        binaryNumbers.add("11111");
        binaryNumbers.add("1110");
        binaryNumbers.add("111101");

      //  System.out.println(sort(binaryNumbers));
        for (String o : binaryNumbers) {

            System.out.println(o);}
    }

    private static List<String>sort(List<String> binaryNumbers) {
Collections.sort(binaryNumbers, new Comparator<String>()
{
        @Override
        public int compare (String o1,String o2){
            if (frequency(o1)==frequency(o2)){
           // if ((frequency(o1)-frequency(o2))==0){
                if(o1.length()==o2.length())
                //if((o1.length()-o2.length())==0)
                    return (Integer.parseInt(o1, 2)-Integer.parseInt(o2, 2));
                else return (o1.length()-o2.length());}
          else   return (frequency(o2)-frequency(o1));
            }
            
        });
   return     binaryNumbers; 
    }
    
    public static int frequency (String o){
        return Collections.frequency(Arrays.asList(o.split("")), "1");

    }
}
