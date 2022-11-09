package HalukHocaJava.j01_Variables.j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1 = sc.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2 = sc.nextInt();
        System.out.println("3.sayıyı giriniz");
        int sayi3 = sc.nextInt();

        hesaplama(sayi1,sayi2,sayi3);


    }

    private static void hesaplama(int sayi1, int sayi2, int sayi3) {

        if(sayi1<sayi2&&sayi1<sayi3){
            System.out.println("en küçük sayı:"+sayi1);
        } else if (sayi2<sayi1&&sayi2<sayi3) {
            System.out.println("en küçük sayı:"+sayi2);
        }else System.out.println("en küçük sayı:"+sayi3);
    }


}

