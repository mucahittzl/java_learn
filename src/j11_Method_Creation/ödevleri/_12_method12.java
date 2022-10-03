package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class _12_method12 {

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
Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz:");
      int  sayı=sc.nextInt();
        System.out.println(powerOfThree(sayı));


    }

    public static boolean powerOfThree (int a) {
        boolean power = false;
        while (a > 3) {
            a /= 3;
        }
        if (a % 3 == 0) power = true;
        return power;

    }

}
