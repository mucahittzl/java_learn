package HalukHocaJava.j01_Variables.j10_StringManipulation;

public class C11_ValueOf_parseü {

    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


//Task->string type verilen iki adet bagıs mıktarını toplayan code create ediniz.
        String bagis1="1500";
        String bagis2="2500";


        int bagısdegeri1= Integer.valueOf(bagis1);//bagis1 string içindeki sayı değerini int e cevirdi bagısdeger1 e atadı
        int bagısdegeri2= Integer.valueOf(bagis2);//bagis2 string içindeki sayı değerini int e cevirdi bagısdeger2 e atadı

        System.out.println("toplam bagıs mıktarı:"+(bagısdegeri1+bagısdegeri2));//4000 verir


        System.out.println("toplam bağış :"+(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));//4000

    int tc=1234567;
   String strtc= String.valueOf(tc);
        System.out.println(strtc);

        System.out.println("strtc+tc"+strtc + tc);//12345671234567



    }
}
