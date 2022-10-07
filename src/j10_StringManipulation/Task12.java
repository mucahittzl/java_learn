package j10_StringManipulation;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */


        Scanner sc=new Scanner(System.in);
        System.out.println("3'lü isim gir:");
        String isim=sc.nextLine().trim();

      String s1=isim.toUpperCase().charAt(0)+".";
      String s2=isim.toUpperCase().charAt(isim.indexOf(" ")+1)+".";
      String s3=isim.toUpperCase().charAt(isim.indexOf(" ",isim.indexOf(" ")+1)+1)+".";

        System.out.println("isminiz:"+s1+s2+s3);









    }
}
