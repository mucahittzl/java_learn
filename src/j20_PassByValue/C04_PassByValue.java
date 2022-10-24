package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyatı;
    static double indirimOranı;

    public static void main(String[] args) {

        /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        1.değişiklik yapılan variableler static olarak tanımlanır.
         */

        etiketFiyatı=100;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);
        indirimOranı=0.11;


        indir();//method call
        indirimOranı=0.22;
        indir();
        indirimOranı=0.05;
        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);


    }//main sonu
    public static void indir(){
        etiketFiyatı*=(1-indirimOranı);
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}
