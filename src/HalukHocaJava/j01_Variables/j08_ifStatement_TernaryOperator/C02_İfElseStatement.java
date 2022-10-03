package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_İfElseStatement {
    public static void main(String[] args) {

        /*
        TASK--->girilen yasın 18 den buyuklugunu kontrol eden code create ediniz.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("sorgulamak istediğiniz yaşı giriniz");
        int yas = sc.nextInt();

        if (yas >= 18) { //girilen yasın 18'den buyuk ve eşit olmasını kontrol eder.
            System.out.println("girilen yas 18'den büyük");
        } else {        //yas 18den kucuk girilirse alttakı code calısır.
            System.out.println("ehliyet alamazsınız");
        }

        //task-->girilen yas 18 den kucuk ıse ehlıyet alamazsınız prınt edınız.















    }
}
