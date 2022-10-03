package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = sc.nextInt();
        if (not < 0 || not > 100)
            System.out.println("duzgun sayı gır");
        else if(not<50){
            System.out.println("not:D");}
        else if(not<60){
            System.out.println("not:C");}
        else if(not<80){
            System.out.println("not:B");}
        else System.out.println("A");







        }


    }

