package j10_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

    Scanner sc=new Scanner(System.in);
        System.out.println("kontrol edilecek karakteri giriniz");
        String karakter= sc.nextLine();
        System.out.println(karakter.contains(" ")?"boşluk içeriyor":"boşluk içermiyor");











    }
}

