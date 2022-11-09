package HalukHocaJava.j01_Variables.j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loop-> önce şart kontrol edilir eğer true alınırsa body çalışır
        do while loop-> önce body actıon çalışır sonra şart kontrol edilir.Şart true ise döngü devam eder
        false ise döngü kırılırve sonraki satıra geçer
        game app de çok fazla kullanılır.
        TRİCK-> while loop şart sağlanmazsa hiç çalışmayabilir ama do while şart sağlasın sağlamasın
        en az 1 kez çalışır.
         */

        int yaş=33;

        while (yaş<33){
            System.out.println("agam yas"+yaş+" "+"  gayet başarılı");
            System.out.println("while body action.....");
            yaş++;
        }

        do {
            System.out.println("agam yas"+yaş+" "+"  gayet başarılı");
            System.out.println("do while body actıon");
            yaş++;
        }while (yaş<33);











    }
}
