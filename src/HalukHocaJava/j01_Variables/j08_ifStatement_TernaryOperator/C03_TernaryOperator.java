package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir:");
        int s= sc.nextInt();

  //  String sonuc=(s%2==0?"cift":"tek");// "?" ife karsılık gelıyor ":" elseye

    //    System.out.println("sonuc="+sonuc);

//trick-->ternary operator ıslem sonucu bır cıktı verır.eger bu cıktı type gore varıable atanmazsa sout ıle yazdırılmalı

    //task--> girilen tam sayının negatıf olmasını kontrol eden code create edınız

        String sonuc=(s<0?"sayı negatıf":"sayı pozıtıf");
        System.out.println("sonuc:"+sonuc);






























    }
}
