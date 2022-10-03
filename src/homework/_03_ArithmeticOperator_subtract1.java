package homework;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

Scanner sc=new Scanner(System.in);
        System.out.println("num1 değerini giriniz");
        int num1= sc.nextInt();
        System.out.println("num2 değerini giriniz");
        int num2= sc.nextInt();
        System.out.println("sonuc:"+(num1-num2));

    }
}
