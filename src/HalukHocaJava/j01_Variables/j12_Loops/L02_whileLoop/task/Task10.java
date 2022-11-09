package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("sayı girniz:");
        int sayı1= sc.nextInt();
        int i=0;
        while (i<=sayı1){
            System.out.print((i%2==1)? i : " " );
            i++;
        }








    }
}
