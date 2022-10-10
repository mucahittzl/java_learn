package TekrarDersleri.For.While;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner sc=new Scanner(System.in);
        System.out.println("iki sayı gir:");
        int sayı1= sc.nextInt();
        int sayı2= sc.nextInt();
        int toplam=0;

        if (sayı1<sayı2){
            for (int i = sayı1; i <=sayı2 ; i++) {
                toplam+=i;
            }
            System.out.println("toplam:"+toplam);
        }










    }
}
