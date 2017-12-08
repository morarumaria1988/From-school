package ex1_book;

//import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(1);
        // System.out.println(circle.toString());
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
       // Triangle triangle = new Triangle();
        double side1 = 0, side2 = 0, side3 = 0;
        Triangle triangle = new Triangle(side1, side2, side3);
        Scanner sc = new Scanner(System.in);
       /* do{
        System.out.println("The biggest side has to be smaller than the sum of the other sides.");
        System.out.println("Set side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Set side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Set side3: ");
        triangle.setSide3(sc.nextDouble());
        }
       while (triangle.getSide2() + triangle.getSide3() <= triangle.getSide1()
                || triangle.getSide1() + triangle.getSide3() <=  triangle.getSide2()
                || triangle.getSide2() + triangle.getSide1()<=  triangle.getSide3());*/
    
       /*double max = 0;
        do{
        System.out.println("The biggest side has to be smaller than the sum of the other sides.");
        System.out.println("Set side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Set side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Set side3: ");
        triangle.setSide3(sc.nextDouble());
        max = Math.max(triangle.getSide1(), Math.max(triangle.getSide2(), triangle.getSide3()));
        }
       while ((max == triangle.getSide1() && (triangle.getSide2() + triangle.getSide3()) <= max)
                || (max == triangle.getSide2() && (triangle.getSide1() + triangle.getSide3()) <= max)
                || (max == triangle.getSide3() && (triangle.getSide2() + triangle.getSide1() )<= max));*/

      /* double max=0 , max2=0;
		do {System.out.println("The biggest side has to be smaller than the sum of the other sides.");
        System.out.println("Set side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Set side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Set side3: ");
        triangle.setSide3(sc.nextDouble());
        max = Math.max(triangle.getSide1(), Math.max(triangle.getSide2(), triangle.getSide3()));
			if(max==triangle.getSide1()) {
				max2 = triangle.getSide2()+ triangle.getSide3();		
			}else if(max==triangle.getSide2()) {
				max2 = triangle.getSide1()+triangle.getSide3();
			}else if(max ==triangle.getSide3())
				max2 = triangle.getSide1()+triangle.getSide2();
		}while(!(max<max2)); */

 /*    double[] sides = new double[3] ;
		do {
			System.out.println("The biggest side has to be smaller than the sum of the other sides. \nGive me three numbers: ");
			sides[0] = sc.nextDouble();
			sides[1] = sc.nextDouble();
			sides[2] = sc.nextDouble();
			Arrays.sort(sides);
		}while(!(sides[2]<sides[1]+sides[0])); */
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
 double max = 0;
  do{
        System.out.println("The biggest side of a triangle has to be smaller than the sum of the other sides.");
        System.out.println("Set side1: ");
        triangle.setSide1(sc.nextDouble());
        System.out.println("Set side2: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Set side3: ");
        triangle.setSide3(sc.nextDouble());
        max=triangle.getSide1();
        if(triangle.getSide2() > triangle.getSide1())
    		max = triangle.getSide2();
    	if(triangle.getSide3()> max)
    		max = triangle.getSide3();
        }
       while (max-(triangle.getSide1()+triangle.getSide2()+triangle.getSide3()-max)>=0);
                
     sc.nextLine();
        System.out.println("Set the color of the triangle: ");
        triangle.setColor(sc.nextLine());
        System.out.println("Should the triangle be filled? (true/false) ");
        triangle.setFilled(Boolean.parseBoolean(sc.nextLine()));
        System.out.println(triangle + " with color " + triangle.getColor() + " (filled: "
                + triangle.isFilled() + ") has the area " + triangle.getArea() + " and the perimeter " + triangle.getPerimeter() + ".");
        
    }
    
    public static void displayObject(GeometricObject object){
        System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
    }
}
