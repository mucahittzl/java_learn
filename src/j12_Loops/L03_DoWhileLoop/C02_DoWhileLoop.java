package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //task->girilen sayı 17 den küçük isekazandınız buyuk ise kaybettiniz print eden code create einiz

        Scanner sc=new Scanner(System.in);

        int sayı=0;

        do{
            System.out.println("bir sayı giriniz : ");
            sayı=sc.nextInt();
                System.out.println(sayı+" için kazandınız");
                sayı++;

        }while (sayı<17);
        System.out.println(sayı+" için kaybettiniz");












    }
}
