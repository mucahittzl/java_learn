package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

*/


        Scanner sc=new Scanner(System.in);
        System.out.println("100 den kucuk tamsayı giriniz:");
        int sayı= sc.nextInt();

    for (int i=1;i<sayı;i++){
        if (i%3==0&&i%5==0){//girilen sayının 3 e ve 5 e bolunme kontrolu
            System.out.println("java candır");
        } else if (i%3==0) {//girilen sayının 3 e bolunme kontrolu
            System.out.println("java");
        }else if (i%5==0){//girilen sayının 5 e bolunme kontrolu
            System.out.println("candır");
        }else System.out.println("dogru deger gırınız");
    }






    }
}
