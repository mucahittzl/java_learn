package j10_StringManipulation.TekrarDersleri;

import java.util.Scanner;

public class boşişler {
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
        char a=scan.next().charAt(0);
        for (int i = 0; i <=str.length() ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(("harf sayısı:"+(j+a)));

            }

        }

    }
}
