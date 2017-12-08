package DayTwo;
  class Rektangel {
     double basen;
     double höjden;

     Rektangel(double basen, double höjden) {
        this.basen = basen;
        this.höjden = höjden;
    }

    double getHöjden() {
        return höjden;
    }

     void setHöjden(double höjden) {
        this.höjden = höjden;
            }

    double getBasen() {
        return basen;
    }

    void setBasen(double basen) {
        this.basen = basen;
    }

    double area() {
        double area = höjden * basen ;
        return area;
    }

    double omkretsen() {
        double omkretsen = 2*höjden + 2*basen;
        return omkretsen;
    }
}

