package homework.j10_StringManipulation;

public class C02_Lenght {
    public static void main(String[] args) {


        /*
        lenght methodu girilen stringin uzunluğunu:içinde bulunan karakter sayısını return eder.
        butun karakterlerı(boşluk vs.) sayı adedini verir
         */

        String str="madem geldin dünyaya otur çalış javaya";

        str.length();//int type bir data verir
        int strkrtrSayısı=str.length();//
        System.out.println(str);//madem geldin dunyaya otur calıs javaya
        System.out.println(strkrtrSayısı);//38

        String str1="";
        System.out.println(str1.length());//0 verir iki tırnak arasında hıc karakter olmadıgı ıcın
        String str2=" ";
        System.out.println(str2.length());//1 verir
        String str3=null;
        System.out.println(str3.length());//cte verir yanı hiçlik diyebiliriz (run time error)
        // Trick->null atanan stringler String method çalışmaz. error verir
        /*
        null case sensitive bir değerdir.yani Null veyaaaa NULL yazılamaz.
        null bir değer değildir(dutluk)sadece hiçliği gosteren bir pointerdir(giriş noktası)
         */
    String name;//deklare edilmiş ama atanmamış strring calısmaz rte verir
       // name.concat(str1); örneğin bu atama calısmaz




    }
}
