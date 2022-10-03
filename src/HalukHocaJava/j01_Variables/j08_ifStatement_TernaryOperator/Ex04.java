package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

/*
TASK-->Girilen bir karakterin harf olup olmadıgını kontrol eden code create ediniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.print("bir karakter giriniz:");
        char ch=sc.nextLine().charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.println("girdiğin karakter harftir");}
            else System.out.println("ahrf değildir");




























    }
}
