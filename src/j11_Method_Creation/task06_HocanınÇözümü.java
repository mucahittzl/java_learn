package j11_Method_Creation;

import java.util.Scanner;

public class task06_HocanınÇözümü {
  static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */

        System.out.println("kare, dikdörtgen,üçgen birini seçiniz : ");
        String secim = sc.next().toLowerCase();
        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = sc.nextInt();

        secim(secim, sayi1, sayi2);
    }

    public static void secim(String str, int sayi1, int sayi2) {
        switch (str) {
            case "kare":
                sayi2=sayi1;
                kareAlan(sayi1);
                kareCevre(sayi2, sayi2);
                break;

            case "dikdörtgen":
dikdörtgenAlan(sayi1,sayi2);
dikdörtgenÇevre(sayi1,sayi2);
                break;

            case "üçgen":
               sayi2=sayi1;
                ucgenalanı(sayi1);
                ucgenCevre(sayi1);

                break;
            default:
                System.out.println("hatalı seçin yaptınız");
                secim(str, sayi1, sayi2);
        }


    }

    private static void ucgenCevre(int sayi1) {
        System.out.println("üçgencevre:"+(sayi1*3));
    }

    private static void ucgenalanı( int sayi1) {
        System.out.println("üçgen yüksekliğini giriniz:");
        int yükseklik=sc.nextInt();
        System.out.println("üçgenalan:"+((yükseklik*sayi1)/2));

    }

    private static void dikdörtgenÇevre(int sayi1, int sayi2) {
        System.out.println("dikdörtgenÇevre"+((sayi1+sayi2)*2));
    }

    private static void dikdörtgenAlan(int sayi1, int sayi2) {
        System.out.println("dikdörtgenalan:"+(sayi1*sayi2));
    }

    private static void kareAlan(int sayi1) {
        System.out.println("kare alan :" + (sayi1 * sayi1));


    }

    private static void kareCevre(int sayi1, int sayi2) {


        System.out.println("kare cevre :" + ((sayi1 + sayi2) * 2));
    }


}