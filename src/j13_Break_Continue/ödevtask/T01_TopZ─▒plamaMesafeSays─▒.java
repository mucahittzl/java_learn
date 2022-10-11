package j13_Break_Continue.ödevtask;

import java.util.Scanner;

class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("topun bırakıldıgı yukseklıgı gırınız:");
        double yukseklık= sc.nextDouble();
        int sekmesayı=0;
        double toplamyol=0;

        do {
            sekmesayı++;
            toplamyol+=yukseklık;
            yukseklık*=((double)3/4);
        }while (yukseklık>1);
        System.out.println("topun sekme sayısı:"+""+sekmesayı+"  "+"alınan yol:"+" "+toplamyol);








    }
}
