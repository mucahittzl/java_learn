package HalukHocaJava.j01_Variables.j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="murat";//ilk değeri murat olarak atanan str1 variable
        String str2="murat";//str1 ve str2 aynı ilk değere sahip oldugu için String havuzunda ortak referans atanır

        String str3=new String("murat");//değerleri aynı referansları farklı obje
        String str4=new String("murat");//değerleri aynı referansları farklı obje

        String str5=str1+"";

        System.out.println(str1 == str2);//T
        System.out.println( str1 == str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3 == str4);//F
        System.out.println( str1 == str5);//F
        System.out.println( str1.equals(str5));//T

    }
}
