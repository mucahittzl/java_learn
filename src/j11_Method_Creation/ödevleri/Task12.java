package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelenecek cümleyi girin:");
        String cümle= sc.nextLine();


        kodlama(cümle);

    }

    private static void kodlama( String harfler) {
        System.out.println(harfler.replace("s","5").replace("a","4").replace("e","3")
                .replace("i","1").replace("o","0").toUpperCase());
    }


}