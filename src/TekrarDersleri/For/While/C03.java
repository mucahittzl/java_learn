package TekrarDersleri.For.While;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

/*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("satır uzunlugu  ve sütun uzunluğu gir:");
        int satır= sc.nextInt();
        int sütun= sc.nextInt();

        for (int i = 1; i <=satır ; i++) {
            for (int j = 1; j <sütun ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }








    }
}
