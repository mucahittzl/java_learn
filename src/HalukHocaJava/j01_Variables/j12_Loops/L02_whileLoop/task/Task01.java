package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner sc = new Scanner(System.in);
        int sayıtoplam = 0;
        int sayı = 0;
        while (sayıtoplam < 333) {
            System.out.println("sayıları giriniz:");
            int tsayı = sc.nextInt();
            sayıtoplam += tsayı;
            sayı++;


        }System.out.println("girilen sayı adedi:" +sayı  + " " + "ve" + "sayı toplamı:" +sayıtoplam );



    }


}
