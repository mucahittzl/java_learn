package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("sayıları giriniz:");
        int sayı1= sc.nextInt();
        int sayı2= sc.nextInt();


        for (int i = sayı1; i <sayı2 ; i++) {

        System.out.println("ara sayılar toplamı:"+i+" ");}










    }
}
