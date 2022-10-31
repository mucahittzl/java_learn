package TekrarDersleri.BisikletDeneme;

import java.util.Scanner;

public class Bisiklet {
   static Scanner scan = new Scanner(System.in);

    int hız;
    int vites;
    static int seçim;

  public static void   menu() {

      do {
          System.out.println("Lütfen islem seciniz: \n" +
                  "1 : Vites Azalt \n" +
                  "2 : Vites Yükselt \n" +
                  "3 : Yeni hiz gir \n" +
                  "4 : Durum göster \n" +
                  "5 : Cikmak icin 5 e basin");
          int seçim= scan.nextInt();
          switch (seçim) {
              case 1:

                break;
              case 2:



          }
      }
      while (seçim!=5);

      }

    private  void vitesAzalt() {
      vites--;
    }
public void vitesArttır(){
      vites++;
}
public void durum(){
    System.out.println("hızınız:"+hız+"ve"+"vitesiniz:"+vites);
}
public void hizDegistir(){
      int yeniHız;
      yeniHız= scan.nextInt();
}

}