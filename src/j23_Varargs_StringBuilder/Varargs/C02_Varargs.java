package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {

        /*
        arr ve varargs method:
         */

        int arr[]={24,42,33,19,34,45,58,38};

    //Task1->array elemanları toplamını print eden method create ediniz
    //task2-> task1 varargs ile çalışınız

        System.out.println(arrTopla(arr));
        System.out.println("Varargs int değer toplamı:"+varargsTopla(24,42,33,19,34,45,58,38));
        System.out.println("Varargs array değer toplamı:"+varargsTopla(arr));
        //Trick->varargs method parametreleri array gibi tanımladıgı için varargs methoda parametre olarak array de verilebilir
    }
    public static int arrTopla(int[]a){//task1
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        return toplam;
    }
    public static int varargsTopla(int... b){
        int toplam=0;
        for (int s:b){
            toplam+=s;
        }
        return toplam;
    }
}
