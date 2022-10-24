package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
static List<Integer>manavÜcret=new ArrayList<>(List.of(5,10,15,20,25));
static List<String>manavÜrün=new ArrayList<>(List.of("elma","armut","çilek","muz","üzüm"));
static Scanner sc=new Scanner(System.in);
static int toplamÜcret=0;
static int Kg=0;
static int toplamkg=0;
    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

    müşteriSecim();



    }

    private static void müşteriSecim() {
        for (int i = 0; i <manavÜrün.size() ; i++) {
            System.out.println(manavÜrün.get(i)+":"+manavÜcret.get(i));
        }
        System.out.println("almak istediğini< ürünü giriniz:");
        String seçim=sc.next().trim().toLowerCase();

        switch (seçim){
            case "elma":
                System.out.println("kaç kg alacaksınız:");
                int kg=sc.nextInt();
toplamÜcret+=kg*manavÜcret.get(manavÜrün.indexOf("elma"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                char işlemdevam = sc.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    müşteriSecim();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamÜcret + " tl dir.");
                break;

            case "armut":

                System.out.println("kaç kg alacaksınız:");
                 kg=sc.nextInt();
                toplamÜcret+=kg*manavÜcret.get(manavÜrün.indexOf("armut"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                 işlemdevam = sc.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    müşteriSecim();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamÜcret + " tl dir.");
                break;

            case "muz":


                System.out.println("kaç kg alacaksınız:");
                kg=sc.nextInt();
                toplamÜcret+=kg*manavÜcret.get(manavÜrün.indexOf("muz"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = sc.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    müşteriSecim();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamÜcret + " tl dir.");
                break;

            case "çilek":

                System.out.println("kaç kg alacaksınız:");
                kg=sc.nextInt();
                toplamÜcret+=kg*manavÜcret.get(manavÜrün.indexOf("çilek"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = sc.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    müşteriSecim();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamÜcret + " tl dir.");
                break;
            case"üzüm":
                System.out.println("kaç kg alacaksınız:");
                kg=sc.nextInt();
                toplamÜcret+=kg*manavÜcret.get(manavÜrün.indexOf("üzüm"));
                System.out.println("işleme devem etmek için 'e' bitirmek için 'h' yazın");
                işlemdevam = sc.next().toLowerCase().trim().charAt(0);
                if (işlemdevam == 'e') {
                    müşteriSecim();
                } else System.out.println("işleminiz tamamlanmıştır ücretiniz : " + toplamÜcret + " tl dir.");
                break;

            default:
                System.out.println("doğru giriş yapın");
                müşteriSecim();











        }












    }


}

