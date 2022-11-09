package HalukHocaJava.j01_Variables.j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {

        /*
        girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method create ediniz
         */
        toplaCarp(2,24,23,38,33,21,59,26,10);
        int arrTop[]={24,23,38,33,21,59,26,10};
        toplaCarp(3,arrTop);
    }
    public static void toplaCarp(int carpilacakSayi,int...toplanacakSayılar){
        int toplam=0;
        for (int a:toplanacakSayılar){
            toplam+=a;
        }
        System.out.println("sonuc ="+(carpilacakSayi*toplam));
    }
}
