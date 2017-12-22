package exercise;

/*
//import java.util.List;
//import java.util.Arrays;

import java.util.*;

public class Imports {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
    }
}
 */

//import static java.util.Arrays; // DOES NOT COMPILE
//import static java.util.Arrays.asList;
//import  java.util.Arrays; 

//static import java.util.Arrays.*; // DOES NOT COMPILE
 import static java.util.Arrays.*; 
//import  java.util.Arrays.*; //unused (nefolositor pt ca are .*)



public class BadStaticImports {

    public static void main(String[] args) {
       // Arrays.asList("one"); // DOES NOT COMPILE
        asList("one"); // DOES NOT COMPILE
        float x=6.4567f;
    }
}
