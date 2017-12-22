package pond.duck;

import pond.goose.Goose;
import pond.shore.Bird;

public class GooseWatcher extends Goose{
//public class GooseWatcher {

    //public void watch() {
    public static void watch() {
        
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE if GooseWatcher  doesn't extend Goose
        Bird.floatInWater();
    }
    public static void main(String[] args) {
        watch()
   ; }
}
