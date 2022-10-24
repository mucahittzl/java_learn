package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {


          /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        2.değişiklik yapılan variableler atama yapılır.
         */
        double etiketFiyatı=100;//primitive data
        double indirimOranı=0.10; //primitive data
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);
        etiketFiyatı=indirim(etiketFiyatı,indirimOranı);
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);


    }
    public static double indirim(double fiyat,double oran){

        fiyat*=(1-oran);
        System.out.println("indirimli fiyat:"+fiyat);
        return fiyat;
    }




}
