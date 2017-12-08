package DayTwo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class PersonNumber {

    private LocalDate localdate;
    private String fourNumber;

    public PersonNumber(LocalDate localDate, String fourNum) {
        localdate = localDate;
        setFourNum(fourNum);

    }

    public void setFourNum(String num) {
        try {
            Integer.valueOf(num);
            if (num.length() != 4) {
                System.out.println("not 4");
                setFourNum(new Scanner(System.in).nextLine());
            } else {
                fourNumber = num;
            }
        } catch (NumberFormatException e) {

            System.out.println("Please Write Only Number");
            setFourNum(new Scanner(System.in).nextLine());
        }
    }

 
    public String toString() {
        return localdate.format(DateTimeFormatter.BASIC_ISO_DATE) + "-" + fourNumber;
    }

}

public class Main {

    public static void main(String[] args) {
        PersonNumber p = new PersonNumber(LocalDate.of(2001, Month.MARCH, 1), "123y5");

        System.out.println(p);

    }
}
