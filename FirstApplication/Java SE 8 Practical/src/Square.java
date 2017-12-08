
public class Square extends TwoDShape {
    public Square(double x,  String n){
        super (x,n);
    }

    @Override
   double area() {
        double area=getWidth()*getWidth();
        return area;
}}
