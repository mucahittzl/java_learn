package homework;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

Scanner sc=new Scanner(System.in);
        System.out.println("toplamak istediğiniz sayıları giriniz:");

    int num1 = sc.nextInt();
    int num2= sc.nextInt();
       int toplam=num1+num2;
        System.out.println("toplam="+toplam);



    }
}
