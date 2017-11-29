package myExercices;
 class Cirkel2 {
private final double pi=3.14;
double radie;

double area() {
    double area=radie*radie*pi;
    return area;
}
 }
class CirkelArea2{
    public static void main(String[] args) {
Cirkel2 c=new Cirkel2();
c.radie=5;
        System.out.println("Cirkelns area med radien "+c.radie+" är "+c.area());
         
    }
    }