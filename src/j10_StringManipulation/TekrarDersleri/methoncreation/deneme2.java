package j10_StringManipulation.TekrarDersleri.methoncreation;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {


/*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("saayıyı gir:");
        int sayı= sc.nextInt();

     sayıkontrol(sayı);
    }

    private static void sayıkontrol(int sayı) {
        if(sayı<0){
            System.out.println("sayı negatif");
            if(sayı%2==1){
                System.out.println("sayı tek");
            } else if (sayı%2==0) {
                System.out.println("sayı cift");
            }
            if(sayı>99){
                System.out.println((sayı%10)+(sayı%10/10)+(sayı/10)+"rakamlar toplamı");}
                else if(sayı<100){
                    System.out.println(sayı%10+"birler basaamağı");
                }

        }else System.out.println("sayı pozitif");
        if(sayı%2==1){
            System.out.println("sayı tek");
        } else if (sayı%2==0) {
            System.out.println("sayı cift");
        }
        if(sayı>99){
            System.out.println((sayı%10)+(sayı%10/10)+(sayı/10)+"rakamlar toplamı");}
        else if(sayı<100){
            System.out.println(sayı%10+"birler basaamağı");
        }
    }


}
