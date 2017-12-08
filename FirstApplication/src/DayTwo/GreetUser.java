package DayTwo;

import java.util.Scanner;

public class GreetUser {

   static  Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
         
            System.out.println("What is your name?");
            String name = keyboard.nextLine ( ) ;
        System.out.println("Hello " + name + ", nice to meet you!");}}

