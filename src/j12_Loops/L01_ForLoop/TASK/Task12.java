package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        /*
        Task->girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamı hesap eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        int toplam=0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("sayı gir:");
        int num1= sc.nextInt();
            if(!(num1 <=10 || num1 >=20)){
                toplam+=num1;
            }
            System.out.println("girdiğiniz sayıların sarta uygun toplamı:"+toplam);
        }











    }
}
