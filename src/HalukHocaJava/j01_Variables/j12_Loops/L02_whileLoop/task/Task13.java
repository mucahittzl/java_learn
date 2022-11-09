package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner sc=new Scanner(System.in);
       char metin;

        do {
            System.out.print("Bir metin giriniz : ");
             metin = sc.nextLine().charAt(0);
                System.out.println(metin=='x'?"JAVATAR":"javaCAN");
            }
        while (metin!='x');






    }
}
