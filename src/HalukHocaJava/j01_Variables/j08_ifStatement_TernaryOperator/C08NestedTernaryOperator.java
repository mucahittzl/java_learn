package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08NestedTernaryOperator {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
                %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
                */


        Scanner sc=new Scanner(System.in);
        System.out.println("ürün miktarı gir");
        int urunMıktar= sc.nextInt();
        System.out.println("urun fiyatı gır:");
        int fiyat= sc.nextInt();

     double fatura=   urunMıktar>100?(urunMıktar*fiyat*0.67):urunMıktar*fiyat;
        System.out.println("fatura"+fatura);





    }
}
