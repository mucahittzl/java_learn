package homework.j10_StringManipulation;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

    String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("a",3));//true 3. indexten itibaren string a ile mi baslar demek
        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.endsWith("bul"));//true
        System.out.println(sehir.endsWith("bu"));//false

        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        //TASK-> Girilen e mail hesabının @gmail.com içermiyorsa "lutfen gmail hesabı giriniz"
        //@gmail.com ile btiiyorsa "hesabınız onaylandı"aksi durumda gecerlı hesap giriniz print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("e mail giriniz");
        String mail= sc.nextLine();
        if(!mail.contains("@gmail.com")) {
            System.out.println("lutfen gmail turunde hesap giriniz");
        }
        if(mail.endsWith("@gmail.com")){
            System.out.println("hesabınız onaylandı");
        }else System.out.println("geçerli hesap giriniz");

    }
}
