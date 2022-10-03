package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
        Task01
girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("sorgulamak istediğiniz sayıyı giriniz");
        int sayi = sc.nextInt();
        if (sayi > 0) {
            System.out.println("sayı pozitif");
        } else if (sayi < 0) {
            System.out.println("sayi negatif");
        } else {
            System.out.println("sayı 0");
        }











    }
}