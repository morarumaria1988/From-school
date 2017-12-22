 package pond.swan;
 import pond.shore.Bird; // in different package than Bird
 
 public class Swan extends Bird { // but subclass of bird
     static Swan other = new Swan();
 public void swim() {
 Bird.floatInWater(); // package access to superclass
 System.out.println(text); // package access to superclass
 }
 public void helpOtherSwanSwim() {
//   Swan other = new Swan();
 other.floatInWater(); // package access to superclass
// floatInWater(); // package access to superclass
// System.out.println(text);// package access to superclass
 System.out.println(other.text);// package access to superclass
 }
public void helpOtherBirdSwim() {
// Bird other = new Bird();
floatInWater();
 other.floatInWater(); // DOES NOT COMPILE if u delete static other
 System.out.println(other.text); // DOES NOT COMPILE if u delete static other
 System.out.println(text);
 }
 }