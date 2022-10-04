package j11_Method_Creation;

import java.util.Scanner;

public class Task04AtmMethod {


    static Scanner sc = new Scanner(System.in);
    static int bakiye = 1000;

    public static void secim() {
        System.out.println("ağam yapacağın işlemi seç:");
        int seçim= sc.nextInt();
        switch (seçim){
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraÇek();
                break;
            case 4:
                çıkış();
                break;
            default:
                System.out.println("doğru seçim yap");
        }


    }

    private static void çıkış() {

        System.out.println("çıkışınız yapılmıştır");


    }

    private static void paraÇek() {

        System.out.println("çekilecek miktar giriniz:");
        int çekilecekMiktar= sc.nextInt();
        if(çekilecekMiktar<=bakiye){
            bakiye-=çekilecekMiktar;
            System.out.println("girilen tutar çekildi");
            System.out.println("yeni bakiye"+bakiye);
        }else System.out.println("bakiye yetersiz");
        karar();


    }

    private static void paraYatir() {

        System.out.println("yatırılacak miktari girin:");
        int yatırılacakMiktar= sc.nextInt();
        bakiye+=yatırılacakMiktar;
        System.out.println("Yeni Bakiye:"+bakiye);
        karar();



    }

    private static void bakiyeVer() {
        System.out.println("bakiyeniz:"+bakiye);
        System.out.println("işleme devam etmek için:1\nsonlandırmak için:0");
        int karar= sc.nextInt();
        if(karar==0){
            çıkış();
        }else secim();




    }

    public static void karar(){
        System.out.println("işleme devam etmek için:1\nsonlandırmak için:0");
        int karar= sc.nextInt();
        if(karar==0){
            çıkış();
        }else secim();
    }

}





