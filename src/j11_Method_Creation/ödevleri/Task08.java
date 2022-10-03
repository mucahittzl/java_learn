package j11_Method_Creation.ödevleri;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */


        Scanner sc=new Scanner(System.in);
        System.out.println("sorgulamak istediğiniz yılı giriniz:");
        int yıl= sc.nextInt();

        artıkyıl(yıl);

    }

    private static void artıkyıl(int sene) {

        if(sene%4==0&&sene%100!=0||sene%400==0){
            System.out.println("girilen yıl artık yıldır");

        }else System.out.println("girilen yıl artık yıl değildir");
    }


}
