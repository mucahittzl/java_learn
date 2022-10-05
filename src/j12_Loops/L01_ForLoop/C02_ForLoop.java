package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //task->girilen sayıdan 100 e kadar +un katı tamsayıları print eden code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("pozitif sayı giriniz :");
        int sayı=sc.nextInt();


if(sayı>100){
    System.out.println("sayıyı 100 den kucuk giriniz");
}else {
    for (int i=sayı;i<100;i++){
        if (i%4==0){
            System.out.print(i+" ");
        }
    }
}






    }
}
