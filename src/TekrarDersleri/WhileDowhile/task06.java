package TekrarDersleri.WhileDowhile;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {


/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */

Scanner sc=new Scanner(System.in);
char c;

do {
    System.out.println("harf gir:");
c=sc.next().toLowerCase().charAt(0);
    System.out.println("program çalışıyor");
}while (c!='x');
        System.out.println("program bitti");







    }
}
