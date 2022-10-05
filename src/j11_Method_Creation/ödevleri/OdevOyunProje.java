package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class OdevOyunProje {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

       static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


baslangıç();





    }//main sonu



    private static void oyun(){
        int oyuncu2puanı=0;
        int oyuncu1puanı=0;
        int ön=1;
        int arka=2;
        System.out.println("1.oyuncu kelime girsin:");
        String kelime1=sc.next();
        System.out.println("1.Oyuncunun girdiği kelime:"+kelime1);

        System.out.println("Oyuncu2 girilen kelimeyi kabul ediyorsa 1 etmiyorsa 0 ı tuşlasın:");
        int karar1= sc.nextInt();
        if(karar1==1){
            System.out.println("oyuncu1puanı:"+(oyuncu1puanı+kelime1.length()));
            System.out.println("oyuncu2puanı:"+(oyuncu2puanı));
        }else System.out.println("geçersiz kelime"+(oyuncu1puanı=oyuncu1puanı));
        System.out.println("oyuna devam etmek istiyorsanız E bitirmek istiyorsanız H yi seçin:");
        char seçim=sc.next().toUpperCase().charAt(0);
        if(seçim=='E'){
            System.out.println("2. oyuncu kelime girsin:");
            String kelime2=sc.next();
            System.out.println("2.Oyuncunun girdiği kelime:"+kelime2);
            System.out.println("kelimeyi öncekinin önüne yazmak için '1'arkasına yazmak için '2'yı seçiniz:");
            switch (ön){
                case 1:
                    kelime2=kelime1+kelime1;
                    break;
                case 2:
                    kelime2=kelime2+kelime1;
            }

            System.out.println("Oyuncu1 girilen kelimeyi kabul ediyorsa 1 etmiyorsa 0 ı tuşlasın:");
            int karar2= sc.nextInt();
            if(karar2==1){
                System.out.println("oyuncu2puanı="+oyuncu2puanı+kelime2.length());
                System.out.println("oyuna devam etmek istiyorsanız E bitirmek istiyorsanız H yi seçin:");
                char secim=sc.next().toUpperCase().charAt(0);
            }else System.out.println("geçersiz kelime"+(oyuncu2puanı=oyuncu2puanı));
        }else System.out.println("Oyun sona erdi");

    }
public static void baslangıç(){
    System.out.println("***KELİME OYUNUNA HOŞGELDİNİZ***");



    oyun();


}

}
