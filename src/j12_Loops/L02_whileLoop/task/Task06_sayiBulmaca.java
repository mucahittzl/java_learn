package j12_Loops.L02_whileLoop.task;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin



        Scanner sc = new Scanner(System.in);

        int tahminsayısı=1;
        int sayı=80;
        while (true){
            System.out.println("1-100 arası tahmin ettiğiniz sayıyı giriniz:");
            int sayıtahmin= sc.nextInt();
            if (sayıtahmin<sayı){
                System.out.println("arttırınız");

            } else if (sayıtahmin>sayı) {
                System.out.println("azaltınız");

            }else break;
            tahminsayısı++;



        }System.out.println(tahminsayısı+" "+"tahminde buldunuz");

    }

}
