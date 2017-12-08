
public class AbsShape  {
    public static void main(String args[]) {  
    TwoDShape shapes[] = new TwoDShape[2];
    //Assign implementations of the Abstract Class TwoDShape to Array
      Rectangle r=new Rectangle(4,6,"r");
      Square s =new Square(4,"s");
      shapes [0]=r;
      shapes [1]=s;
     
      for (TwoDShape shape : shapes) {
          //print information about different shapes
         
          System.out.println(shape.area());
          
      }  
  } 
}
