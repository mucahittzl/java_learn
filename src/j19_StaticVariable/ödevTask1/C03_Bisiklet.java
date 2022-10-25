package j19_StaticVariable.ödevTask1;

import java.util.Scanner;

public class C03_Bisiklet {

    Scanner scan = new Scanner(System.in);

int hız;
int vites;
static int seçim;

    public C03_Bisiklet(int hız, int vites) {
        this.scan = scan;
        this.hız = hız;
        this.vites = vites;
    }

    public void hizDegistir() {
        System.out.println("hizi giriniz: ");
        hız = scan.nextInt();
    }

    public void vitesArttir() {
        vites++;
        if (vites > 5) {
            System.out.println("daha yüksek vites mevcut degil");
            vites = 5;
        }
    }

    public void vitesAzalt() {
        vites--;
        if (vites < 1) {
            System.out.println("daha dusuk vites mevcut degil");
            vites = 1;
        }

    }

    public void durumGoster() {
        System.out.println("vites = " + vites);
        System.out.println("hiz = " + hız);
    }

    public void menu() {

        do {
            System.out.println("Lütfen islem seciniz: \n" +
                    "1 : Vites Azalt \n" +
                    "2 : Vites Yükselt \n" +
                    "3 : Yeni hiz gir \n" +
                    "4 : Durum göster \n" +
                    "5 : Cikmak icin 5 e basin");
            int seçim = scan.nextInt();
            switch (seçim) {
                case 1:
                    vitesAzalt();
                    break;
                case 2:
                    vitesArttir();
                    break;
                case 3:
                    hizDegistir();
                    break;
                case 4:
                    durumGoster();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("doğru değer giriniz");
            }
        }
        while (seçim != 5);
    }



}

