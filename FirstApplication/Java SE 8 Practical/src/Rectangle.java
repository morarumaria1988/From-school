
public class Rectangle extends TwoDShape{
    public Rectangle(double w, double h, String n){
        super (w,h,n);
    }

  
    @Override
    double area() {
        double area=getWidth()*getHeight();
        return area;
       
    }
}


