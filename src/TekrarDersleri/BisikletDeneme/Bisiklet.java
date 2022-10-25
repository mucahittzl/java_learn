package TekrarDersleri.BisikletDeneme;

import java.util.Scanner;

public class Bisiklet {
    Scanner scan = new Scanner(System.in);

    int hız;
    int vites;
    static int seçim;

  public void   menu() {

      do {
          System.out.println("Lütfen islem seciniz: \n" +
                  "1 : Vites Azalt \n" +
                  "2 : Vites Yükselt \n" +
                  "3 : Yeni hiz gir \n" +
                  "4 : Durum göster \n" +
                  "5 : Cikmak icin 5 e basin");
          int seçim= scan.nextInt();
          switch (seçim) {



          }
      }
      while (seçim!=5);

      }

    private void vitesAzalt() {
      vites--;
    }





}