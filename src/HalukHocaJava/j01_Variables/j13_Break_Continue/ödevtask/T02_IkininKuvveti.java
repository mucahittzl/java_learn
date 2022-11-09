package HalukHocaJava.j01_Variables.j13_Break_Continue.ödevtask;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

    PowersofTwo();


    }

    private static void PowersofTwo() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("datayi gir:");
        int data= sc.nextInt();


        for (int i = 2; i <=data ; i++) {
          if(data%2==0) {
              System.out.println("2 nin kuvveti");
              break;
          }else System.out.println("2 nin kuvveti değil");
          break;
        }
        
        
        
        
        
        
        
        
        
        
    }
}

