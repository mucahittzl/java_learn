package HalukHocaJava.j01_Variables.j10_StringManipulation;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */


        Scanner sc=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz : ");
        String ad_soyad = sc.nextLine().trim();
        if(ad_soyad.contains(" ")){
        String ad = ad_soyad.toUpperCase().charAt(0) + ad_soyad.substring(1, ad_soyad.indexOf(" "));
        String soyad = ad_soyad.toUpperCase().charAt(ad_soyad.indexOf(" ") + 1) + ad_soyad.substring(ad_soyad.indexOf(" ") + 2);
        System.out.println("İsminiz : " + ad);
        System.out.println("Soyisminiz : " + soyad);}
else System.out.println("boşluk bırakarak tekrar giriniz");















    }
}
