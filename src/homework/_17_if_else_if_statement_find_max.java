package homework;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("num1 giriniz");
        int i1 = scan.nextInt();
        System.out.println("num2 giriniz");
        int i2 = scan.nextInt();
        System.out.println("num3 giriniz");
        int i3 = scan.nextInt();

        if(i1>i2 && i1>i3){
            System.out.println("i1 en büyük sayıdır");}

            if(i2>i1 && i2>i3){
                System.out.println("i2 en buyuk sayıdır");}

        if(i3>i2 && i3>i1){
            System.out.println("i3 en buyuk sayıdır");}


















    }
}
