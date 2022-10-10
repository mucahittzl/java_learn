package homework.j10_StringManipulation;

import java.util.Scanner;

public class Task05derste {
    public static void main(String[] args) {

        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("ad gir");
        String ad= sc.nextLine();
        System.out.println("soy ad gir:");
        String soyad= sc.nextLine();

        System.out.println(ad.toUpperCase().charAt(0)+ad.substring(1)+""+soyad.toUpperCase().charAt(0)+""+soyad.substring(1));
















    }
}
