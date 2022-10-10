package homework.j10_StringManipulation;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */


            Scanner sc=new Scanner(System.in);
        System.out.println("üç harflı isim gir");
        String isim= sc.nextLine();
        System.out.println(isim.charAt(0)==isim.charAt(1)||isim.charAt(0)==isim.charAt(2)||isim.charAt(1)==isim.charAt(2)?"aynı karakter var":"farklı karakterler");









    }
}