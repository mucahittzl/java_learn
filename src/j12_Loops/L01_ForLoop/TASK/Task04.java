package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

/*
girilen iki sayı arasındaki çift sayıları print den code create ediniz
 */


        Scanner sc=new Scanner(System.in);
        System.out.println("sayıları giriniz");
        int sayı1= sc.nextInt();
        int sayı2= sc.nextInt();

        if (sayı1<sayı2){
        for (int i=sayı1;i<=sayı2;i++){
         if (i%2==0) {
             System.out.print(" " + i);
         }else System.out.println("hatalı giriş yapıldı");
    }
}








    }//main dışı





}
