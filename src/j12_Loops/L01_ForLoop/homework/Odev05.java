package j12_Loops.L01_ForLoop.homework;

import java.util.Scanner;

public class

Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Bir Sayı giriniz ");
        int sayı = scan.nextInt();
powerOfThree(sayı);
        System.out.println(sayı+" sayısı üçün kuvveti mi ? = "+powerOfThree(sayı)+"/"+(powerOfThree(sayı)==true?"evet":"hayır"));

    }

    private static boolean powerOfThree(int a) {

        if (a % 6 == 0) {
            return false;
        } else {
            int count = 0;
            for (int i = 3; i < a; i *= 3) {
                if ((a % i != 0))
                    count++;
            }
            return count == 0;
        }


    }
}
