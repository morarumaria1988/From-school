
public abstract  class TwoDShape {
    private double width;  
  private double height;  
  private String name;  
  
  // A default constructor.  
  TwoDShape() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
  // Parameterized constructor.  
  TwoDShape(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
  // Construct object with equal width and height.  
  TwoDShape(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
  
  // Accessor methods for width and height.  
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  // Now, area() is abstract. 
  abstract double area();
  
}
