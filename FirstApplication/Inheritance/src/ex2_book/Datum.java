
package ex2_book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Datum {
public static void main(String[] args) {
Date nu;
nu = new Date();
System.out.println(nu);

LocalTime now1 = LocalTime.now();
System.out.println(now1);
LocalDate now2 = LocalDate.now();
System.out.println(now2);
LocalDateTime now3 = LocalDateTime.now();
System.out.println(now3);
}
}