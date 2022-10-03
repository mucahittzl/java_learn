package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("tam sayı gır:");
        int sayı=sc.nextInt();
     //   String sonuc=(sayı%2==0?sayı/2:"sayı tek oldugu ıcın tamsayı değıldır");

    /*Trick->ternary iki durum(t/f) için farklı data type cıktısı verıyorsa varıable atama yapmadan sout yapılmalı
    yada ternary aynı data type'a cast edilmeli.
     */

        System.out.println(sayı%2==0?sayı/2:"sayı tek oldugu ıcın tamsayı değıldır");










    }
}
