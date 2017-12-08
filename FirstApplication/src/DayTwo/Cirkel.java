package DayTwo;
  class Cirkel {

    final double PI = 3.14;
    public double radie;
    private double diameter;

     Cirkel(double radie) {
        this.radie = radie;
        this.diameter = radie * 2;
    }

    double getRadie() {
        return radie;
    }

     void setRadie(double radie) {
        this.radie = radie;
        this.diameter = radie * 2;
    }

    double getDiameter() {
        return diameter;
    }

    void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    double area() {
        double area = radie * radie * PI;
        return area;
    }

    double omkretsen() {
        double omkretsen = diameter * PI;
        return omkretsen;
    }
}

