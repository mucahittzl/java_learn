package HalukHocaJava.j01_Variables.j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task07Nested3 {
    public static void main(String[] args) {


       /*
Task ->
girilen boyuttta bir kare için
 Ekran Çıktısı
    Bir sayı giriniz: 7
    1 0 0 0 0 0 0
    0 1 0 0 0 0 0
    0 0 1 0 0 0 0
    0 0 0 1 0 0 0
    0 0 0 0 1 0 0
    0 0 0 0 0 1 0
    0 0 0 0 0 0 1


    Bir sayi giriniz: 5
    1 0 0 0 0
    0 1 0 0 0
    0 0 1 0 0
    0 0 0 1 0
    0 0 0 0 1

    şekli print eden code create ediniz
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi=sc.nextInt();

        for (int i = 0; i <sayi;i++){
            for (int j = 0; j < sayi; j++) {
                if(i==j)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }





    }
}
