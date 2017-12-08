  package DayTwo;
  class Triangel {
     double basen;
     double höjden;
     double s1;
     double s2;
     double s3;

     Triangel(double basen, double höjden,double s1,double s2,double s3) {
        this.basen = basen;
        this.höjden = höjden;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
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
    double getS1() {
        return s1;
    }

    void setS1(double s1) {
        this.s1 = s1;
    }
    double getS2() {
        return s2;
    }

    void setS2(double s2) {
        this.s2 = s2;
    }
    double getS3() {
        return s3;
    }

    void setS3(double s3) {
        this.s3 = s3;
    }

    double area() {
        double area = (höjden *basen)/2; ;
        return area;
    }

    double omkretsen() {
        double omkretsen = s1+s2+s3;
        return omkretsen;
    }
}

