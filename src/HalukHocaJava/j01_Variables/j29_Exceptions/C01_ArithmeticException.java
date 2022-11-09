package HalukHocaJava.j01_Variables.j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.print("agam 1. sayı giresen : ");
        int sayi1 = sc.nextInt();

        System.out.print("agam 2. sayı giresen : ");
        int sayi2 = sc.nextInt();

        int oran;//RTE -> ArithmeticException/ by zero

        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmazçcatch block try block exception hat yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3-Parent-child ilişkisi olan catch'larda child önce yazılmalıdır.Aksi halde CTE verir

             */
            oran = sayi1 / sayi2;// try block'da hata yakalandığı satırdan sonra try diğer satırkar değil ilgili catch block çalışır

            System.out.println(oran);
            System.out.println("agam try block'tan selamlar :) ");

        }catch (ArrayIndexOutOfBoundsException arrayExc){
            System.out.println("agam array'da olmayan eleman istirsen");
        }

        catch (ArithmeticException falanFilan){//child exception parent exception(Exception ebikGabık)
            System.out.println("agam bölmede bölen 0 olamaz"+falanFilan.getMessage());//Exception oluştugunda sadece hata mesajı print etmek için getMessage() kullanılır
            falanFilan.printStackTrace();//OLUSAN EXCEPTİON TUM DETAY BİLGİSİ PRİNT ETMEK İÇİN KULLANILIR. en sona yazar.
            System.out.println("agam cırak catch'ten selamlar");
        }
        catch (Exception ebikGabık) {//Exception Class tum exceptionlarınHz Ademi parent class->bad practice
            // hata yakalndıgında yapılacak aksiyonların oldugu block
            //Exception>oluşan hata data type
            //ebikGabık-> java'nın oluşan exception'a atayacağı obje name.BEST PRACTİSE-> 'e' kullanılır
            System.out.println("agam nişledingg 0 hiç böler mi :( ");
            System.out.println("agam catck block'tan selamlar :) ");
        }

        finally {// catch blocklardan sonra istenirse finally block kullanılabilir
            /*
            try-catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally tanımlanır
            hata durumunda catch çalışmazsa program sonlanır.Ancak finally tanımlanırsa catch çalışmasa bile
            program akışı devam eder.finally block hata olsa da olmasa da çalışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.Cloud ile connection yazdıgınızda code
            başarıılı bir şekilde çalısırsa işlem bittiğinde finally block ile connection kapanmazsa maliyeti pahalı olur
             */
            System.out.println("agam finally blocktan selamlar");

        }

       // catch (ArithmeticException falanFilan){//child exception parent exception(Exception ebikGabık)den sonra tanımlandığı için CTE
       //
       // }
        System.out.println("Agam sorun handle  DEWAMKEEE :) ");//program sonuna kadar çalıstıgı anlaşılsın dıye yazıldı



    }
}
