package DayTwo;

import java.util.Scanner;

class AreaOchOmkrets {

    static Scanner sc = new Scanner(System.in);

    /*static Scanner basen = new Scanner(System.in);
    static Scanner höjden = new Scanner(System.in);
    static Scanner s1 = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);
    static Scanner s3 = new Scanner(System.in);
    static Scanner shape = new Scanner(System.in);*/
    public static void main(String[] args) {
        System.out.println("Skriv för vilken typ av figur du vill du beräkna area och omkrets (cirkel/triangel/rektangel): ");
        String figur= sc.nextLine();
        switch (figur) {
            case "cirkel":
                cirkel();
                break;
            case "triangel":
                triangel();
                break;
            case "rektangel":
            rektangel();
            break;
            default:
                System.out.println("Ej giltig inmatning");
        }
    }
    public static void cirkel() {
        System.out.print("Skriv cirkelns radie: ");
        Cirkel c = new Cirkel(sc.nextInt());
        System.out.println("Cirklens area med radien " + c.getRadie()
                + " är " + c.area() + " och omkretsen är " + c.omkretsen());
    }

    public static void rektangel() {
        System.out.print("Skriv rektangels bas: ");
        double basen = sc.nextDouble();
        System.out.print("Skriv rektangels höjd: ");
        double höjden = sc.nextDouble();

        Rektangel rec = new Rektangel(basen, höjden);

        System.out.println("Rektangels area med basen " + rec.basen + " och " + rec.höjden
                + " är " + rec.area() + " och omkretsen är " + rec.omkretsen());
    }

    public static void triangel() {
        System.out.print("Skriv triangels höjd: ");
        double höjden = sc.nextDouble();
        System.out.print("Skriv triangels bas: ");
        double basen = sc.nextDouble();
        System.out.println("Skriv triangels sidor: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        Triangel c = new Triangel(höjden, basen, s1, s2, s3);
        System.out.println("Triangels area med sidorna "+c.getS1()+", "+c.getS2()+", "+c.getS3()+", höjden " + c.getHöjden()+
        " och " + c.getBasen()+" är " + c.area() + " och omkretsen är " + c.omkretsen());
    }
}
