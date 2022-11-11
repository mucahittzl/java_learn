package HalukHocaJava.j01_Variables.j29_Exceptions.TASKS;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("Hava Gerçekten soğuk dışarı çıkma");

}

main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}

}
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        try {
            System.out.print("hava sıcaklığını giriniz :");
            int derece = sc.nextInt();
            havaDurumu(derece);
            System.out.println("sıcaklık normal");


        } catch (IOException e) {
            System.out.println(e);
            e.getStackTrace();
            System.out.println(e.getMessage());
        }

    }

    private static void havaDurumu(int derece) throws IOException {
        if (derece < 10)
        throw new IOException("Balkanlardan gelen bi şeyler var!!");

    }
}
