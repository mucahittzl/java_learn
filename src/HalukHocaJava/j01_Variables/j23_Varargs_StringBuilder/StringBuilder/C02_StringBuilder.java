package HalukHocaJava.j01_Variables.j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        //StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1=new StringBuilder();//default capacity 16 bit lan value'su olmayan boş
        System.out.println("sb1.length() = " + sb1.length());//0 ->length() sb'de ki rakter sayısını return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//ayırdıgı kapasıte 16

        sb1.append("javatar");//javatar sb1'e eklendi
        System.out.println("sb1 = " + sb1);

        System.out.println("sb1.capacity() = " + sb1.capacity());//ayırdıgı kapasıte 16

        System.out.println(sb1.append(" selam").append(" ").append("olsun").append(" ").append(24).append(" ").append(true));

        System.out.println("sb1.capacity() = " + sb1.capacity());//ayırdıgı kapasıte 34

        sb1.append("başarı gayrete aşıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//ayırdıgı kapasıte 70

        // 2. yol

        StringBuilder sb2=new StringBuilder("Kevser hanıma selamlar");// ilk değer ataöası yapılnış sb1 STBuild obj
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//38-> 22 karakter ilk değer atamasında oluştu + 16 default hafıza değeri atandı
        //trim()-> fazladan ayrıllan capacity silinir

        System.out.println("sb2.length() = " + sb2.length());//22
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());//22 length'e eşitledik default olarak javadan gelen alan silindi

        // 3. yol

        StringBuilder sb3=new StringBuilder(11);//hafızada 11 karakterlik yer ayıran boş stringbuılder tanımlandı
        System.out.println("sb3.length() = " + sb3.length());//0 çünkü boş
        System.out.println("sb3.capacity() = " + sb3.capacity());//11 atandı
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        // istenen bir character indexi alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m


        // Belirli aralıktaki character'leri alma

        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//atar selam 3. index dahil 13. hariç değeri yazdırdı
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17.18.... sona kadar un 24 truebaşarı gayrete aşıktır :)
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//atar selam

        // belirli bir indexteki karakteri silmek

        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3)); // 3. index silindi (a harfi)
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));// 3.4.5.6. index karakterler silindi javselam olsun 24 truebaşarı gayrete aşıktır :)

        //istenen karakter ve karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,:)) = " + sb3.insert(4, ":)"));//ebub:)ekir bey
        String s="güzel insan";
        //System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));//ebub:)ekigüzel insanr bey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//eel ibub:)ekir bey s stringinin 3,4,5,6,7 değerlerini ekler

        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım sadece Qa alır

        // istenen index'deki karakteri değiştirme

        sb4.setCharAt(6,'A');
        System.out.println("sb4 = " + sb4);//NihanQA Hanım
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);//NihanQA:Hanım
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " "));//Nihan QA:Hanım

        //insert methodu yeni eleman koyar set methodu var olan elemanı değiştirir.

        //istenen index'e karakter yerine birden cok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));// Nihan QAhianım

        //Sb obj Stringe çevirme-> toString() methodu

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//EEL İBUB:)EKİR BEY->sb3 SB stringe cevirerek toUppercase methodu çalıstı

        //String ile StringBuilder karsilastirmasi


            /*
            Compare iki sb'i esit mi diye kontrol etmek icin
            ilk harften baslayarak tum karakterleri karsilastirir
            Ayni olan karakterler icin bir sey return etmezken
            farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
            oldugunu print eder
            Tamamen ayni ise bize 0 return eder

            bir sb ile bir String'i compare etmek istersek Java CTE verir
             */

        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0 verir tamamen aynı oldugu ıcın
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        //sb5.compareTo(str1)//CTE -> elma armut kıyası olmaz
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true


    }
}
