package HalukHocaJava.j01_Variables.j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {

        //NumberFormatException->Sayı formatında olmayan bir datayı parseInt() method run ederek ınteger'e çevirildiğinde oluşan RTE Exception
        //java'da String içindeki rakam karakterler parseInt() method ile değere atanabilir

        String str="1453";
        System.out.println("str = " + str+5);//14535 ->concat edilir
         int sayi=Integer.parseInt(str);// str deli rakam karakter sayii variable atandı
        System.out.println("sayi = " + sayi);//1453
        System.out.println("sayi+5 = " + (sayi + 5));//1458

        String id="57l622";
        //System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//RTE VERİR NumberFormatException

        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (NumberFormatException e){//Catch çalışır
            System.out.println("agam l'den 1 yazmamı istirsen olamazz");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }

        try {
            System.out.println("Integer.parseInt(atr) = " + Integer.parseInt(str));//TRY çalışır
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (NumberFormatException e){
            System.out.println("agam l'den 1 yazmamı istirsen olamazz");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }

        System.out.println("agam sorun handle edildi dewamkee");//bu code çalışmazsa pr sorunsuz kırılmadan un olmustur


    }
}
