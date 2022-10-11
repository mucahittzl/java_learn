package TekrarDersleri.WhileDowhile;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

// girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir:");
        int sayı= sc.nextInt();
        int rakamtoplam=0;

    while (sayı>=1){
        rakamtoplam+=sayı%10;
        sayı/=10;
    }
        System.out.println("rakam toplam: "+rakamtoplam);





    }
}
