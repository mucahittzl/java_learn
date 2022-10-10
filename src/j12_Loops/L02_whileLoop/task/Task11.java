package j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */


        Scanner sc=new Scanner(System.in);
        int sayı=0;
        int girilenS=1;
        int sayaç=0;

        while (girilenS!=0){
      System.out.println("sayı giriniz:");
      girilenS= sc.nextInt();
      sayı+=girilenS;
      sayaç++;
}
        System.out.println(" girilen sayıların adedi : "+sayaç+"\nToplamları : "+sayı);
    }
}
