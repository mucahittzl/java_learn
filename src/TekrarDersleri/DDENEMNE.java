package TekrarDersleri;

import java.util.Scanner;

public class DDENEMNE {
    public static void main(String[] args) {




// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.


Scanner sc=new Scanner(System.in);
        System.out.println("isim ve soy isminizi giriniz:");
        String ad=sc.nextLine();
        System.out.println("soy adınızı giriniz:");
        String soyad=sc.nextLine();
        if(ad.length()>soyad.length()){
            System.out.println("ad uzun");

        }else System.out.println("soyad uzun");









    }

}