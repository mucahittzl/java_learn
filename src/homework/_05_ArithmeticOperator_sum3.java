package homework;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */
     Scanner sc=new Scanner(System.in);
        System.out.println("s1 değerini giriniz");
        int s1= sc.nextInt();
        System.out.println("s2 değerini giriniz");
        int s2= sc.nextInt();
        System.out.println("s3 değerini igiriniz");
        int s3=sc.nextInt();
        System.out.println("toplam:"+(s1+s2+s3));

    }
}
