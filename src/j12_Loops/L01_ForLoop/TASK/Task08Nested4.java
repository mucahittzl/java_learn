package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task08Nested4 {
    public static void main(String[] args) {


        /*
        task->girilen boyutta kare çarpım taplosu print eden code create ediniz
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi=sc.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            for (int j =1; j <=sayi ; j++) {
                System.out.print(" "+(i*j));
            }
            System.out.println();//dumy
        }




    }
}
