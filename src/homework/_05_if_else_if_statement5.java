package homework;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        double d1 = 90.25;
        double d2 = 90.25;
        if (d1 > d2) {
            System.out.println("hello world");
        } else if (d1 > d2) {
            System.out.println("not hello world");
        } else {
            System.out.println("ı love java");
        }

    }


}

