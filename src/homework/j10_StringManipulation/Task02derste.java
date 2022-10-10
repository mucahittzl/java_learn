package homework.j10_StringManipulation;

import java.util.Scanner;

public class Task02derste {
    public static void main(String[] args) {

       /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */

        Scanner sc=new Scanner(System.in);
        System.out.println("password giriniz:");
        String password= sc.nextLine();


        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&//a sartı
                (password.charAt(password.length()-1)>='0'&&// b sartı
                password.charAt(password.length()-1)<='9')&&// c sartı
                (password.length()>=6)) {
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");

















    }
}
