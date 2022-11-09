package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz


        Scanner sc = new Scanner(System.in);
        int max=0;
        int i=1;
        int girilensayi;

        while (i<=5){
            System.out.print(i+". sayıyı giriniz: ");
            girilensayi= sc
                    .nextInt();
            max= Math.max(max, girilensayi);
            i++;
        }
        System.out.println("max = " + max);
















    }
}
