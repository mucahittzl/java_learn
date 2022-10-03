package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir:");
        int sayı= sc.nextInt();
        String sonuc=(sayı>9?"2 basamaklı veya daha fazla":"tek basamaklı");
        System.out.println("sonuc:"+sonuc);




























    }
}
