package TekrarDersleri.WhileDowhile;

import java.util.Scanner;



public class ödev1 {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner sc=new Scanner(System.in);
        System.out.println("string ifade gir:");
        String ifade=sc.nextLine();

        for (int i = 0; i <ifade.length() ; i++) {
            if (ifade.charAt(i)=='a'||ifade.charAt(i)==' ')continue;
            System.out.println(ifade.charAt(i));
        }
}






    }

