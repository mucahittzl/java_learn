package TekrarDersleri.BOŞ_DENEMELER;

import java.util.Scanner;

public class githubiçindeneme {

    /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
    */
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {





        bilet();
    }

    private static void bilet() {

        System.out.println("HOŞGELDİNİZ");
        System.out.println("hangi şehre uçmak istediğinizi seçiniz: B -C -D ");
        String seçim = sc.next().toUpperCase();
        System.out.println("yaşınızı giriniz:");
        int yas = sc.nextInt();
        System.out.println("tek yön bilet için 1  çift yön bilet için 2 seçiniz:");
        int tçyön = sc.nextInt();

    }

    }


