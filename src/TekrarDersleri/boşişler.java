package TekrarDersleri;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class boşişler {

    public static void main(String[] args) {

varargs(5,1,2,2);

        }
public static double varargs(double...sayı) {
    double çarpım = 1;
    for (double x : sayı) {
        çarpım *= x;


    }
    System.out.println(çarpım);
    return çarpım;
}
}











