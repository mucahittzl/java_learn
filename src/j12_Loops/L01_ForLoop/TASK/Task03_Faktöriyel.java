package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task03_Faktöriyel {


    public static void main(String[] args) {

     /*
     Task->girilen sayının faktöriyelini hesaplayan method create ediniz.
     sayı!=1*2*3....sayı
      */

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı= sc.nextInt();


        faktöriyel(sayı);





    }

    private static void faktöriyel(int sayı) {
int faktöriyel=1;
        for (int i=1;i<=sayı;i++){
            faktöriyel*=i;
            System.out.println(faktöriyel);
        }
        System.out.println("faktöriyel:"+faktöriyel);

    }


}
