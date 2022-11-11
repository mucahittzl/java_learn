package HalukHocaJava.j01_Variables.j29_Exceptions.TASKS.OkulTaskı;

import java.util.ArrayList;

public class OkulMain {
   /* 1- fieldları ad, soyad, yas olan bir It pojo class'ı create ediniz.

            2- fieldları okulAd, maxOgrenciSayisi,
    ArrayList cinsinden Öğrencileri olan bir Clarusway pojo class create ediniz,

     3- main metodunun olduğu OkulMain isimli bir class create ediniz.

            4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    public static void main(String[] args) {
*/

    public static void main(String[] args) {

        Claruway okul = new Claruway();
        okul.okulAd = "Edirne Lisesi";
        okul.maxOgrenciSayisi = 3;

        while (true) {
            ;
            okul.ogrencikayıt();

            try {
                if (okul.ogrenciliste.size()>=okul.maxOgrenciSayisi){
                    throw new IllegalArgumentException();
                }
            }catch (Exception e){
                System.out.println("Kayıt Doldu");
                break;
            }
        }
        okul.ogrenciBilgileri();
    }
}
