package TekrarDersleri.methoncreation;

import java.util.Scanner;

public class deneme3 {
  static   Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {



//Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz


        System.out.println("toplamak istediğin saayıyı gir:");
        int adet= sc.nextInt();
        if(adet<2){
            System.out.println("en az iki sayı giriniz");
        } else if (adet==2) {
            ikisayitopla();

        } else if (adet==3) {
            üçsayitopla();
        } else if (adet==4) {
            dörtsayitopla();
        }else System.out.println("cok sayı girdiniz");


    }

    private static void dörtsayitopla() {
        System.out.println("dört sayı giriniz");
        double sayi1= sc.nextDouble();
        double sayi2=sc.nextDouble();
        double sayi3= sc.nextDouble();
        double sayi4=sc.nextDouble();
        System.out.println("dört sayı toplamı:"+(sayi1+sayi2+sayi3+sayi4));
    }

    private static void üçsayitopla() {
        System.out.println("üç sayı giriniz");
        double sayi1= sc.nextDouble();
        double sayi2=sc.nextDouble();
        double sayi3= sc.nextDouble();
        System.out.println("üç sayı toplamı:"+(sayi1+sayi2+sayi3));
    }

    private static void ikisayitopla() {
        System.out.println("iki sayı giriniz");
        double sayi1= sc.nextDouble();
        double sayi2=sc.nextDouble();
        System.out.println("iki sayı toplamı:"+(sayi1+sayi2));
    }


}
