package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task10Nested6 {
    public static void main(String[] args) {


        /*
        girilen ifadenin istenen harf sayısını print eden code create ediniz
        input:selam javaCAN'lar
        output:a sayısı :3
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("ifade giriniz");
        String str = scan.nextLine();
        System.out.println("istenen harf sayısını giriniz");
        char harf = scan.next().charAt(0);
        int syma = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == harf) {
                syma++;
            }

        }
        System.out.println("aradığınız harf"+" "+syma+" "+"tane var");









    }
}
