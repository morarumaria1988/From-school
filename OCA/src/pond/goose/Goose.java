package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
static Goose other = new Goose();
    public static void helpGooseSwim() {
    //    Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public static void  helpOtherGooseSwim() {
        Bird other = new Goose();
        // Bird other = new Bird ();
        other.floatInWater(); // DOES NOT COMPILE if floatInWater() and text are not static in Bird
        System.out.println(other.text); // DOES NOT COMPILE if  text is not static in Bird
    }
    public static void main(String[] args) {
        helpOtherGooseSwim();
        helpGooseSwim();
    }
}
