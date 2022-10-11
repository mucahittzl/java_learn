package TekrarDersleri.WhileDowhile;

public class task03 {
    public static void main(String[] args) {

         /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****

*/

        for (int i = 1; i <5 ; i++) { // satır kontrolu
            for (int j = 5-i; j >0 ; j--) { // boşluk kontrolü
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++) { // sütun kontrolü
                System.out.print("*");
            }
            System.out.println(" ");
        }











    }
}
