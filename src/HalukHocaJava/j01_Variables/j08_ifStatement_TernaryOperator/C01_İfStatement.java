package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

public class C01_İfStatement {
    public static void main(String[] args) {

        int krmmYas = 45;
        int ismYas = 63;
        if (krmmYas == ismYas) {
            System.out.println("aynı yastasınız guzel insanlar");//çalısmaz
            System.out.println("yoksa siz ikizmisiniz");//çalısmaz
        }
        if (krmmYas >= 40) System.out.println("krm bey olgunluk yasındasınız");//çalısır

        if (krmmYas + ismYas > 100) {
            System.out.println("kerm bey ve ısmabey yasları toplamı 100 den buyuk");//calısır
        }
        //ctrl+alt+l--->yaparsanız code reformat java format yapar.düzenlemiş olur.
        /*
        bağımsız if statement yapıları sadece kendı kapsamlarını run eder.
        birden fazla bagımsız if statement yapıları hepsinin body calısabileceği gibi hiçbirisini body de calısmayabilir.
         */
    //if blokta {} kullanılmazsa ilk ; a kadar olan komut çalısır veya çalısmaz alt saatırdan devam eder.
    }
}
