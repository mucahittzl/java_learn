package j12_Loops.L02_whileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //task-> girilen tamsayının rakamları toplamını prınt eden method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayı=sc.nextInt();

        System.out.println(toplam(sayı));











    }//main sonu

    private static int toplam(int sayı) {

        int rakamtoplamı=0;

        while (sayı>0){         //sayı 1 olana dek body aksıyon çalıs
            rakamtoplamı+=sayı%10; // sayının birler basamağı (rakamtoplamı) na eklendi
            sayı/=10; // birler basamağı eksiltildi

        }
return rakamtoplamı;


    }


}
