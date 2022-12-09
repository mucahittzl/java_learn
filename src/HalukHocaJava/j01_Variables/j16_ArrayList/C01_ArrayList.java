package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi=33; //tek bir data saklayabilen variable
        int sayi1[]=new int[5]; // 5 int değer saklayabilen yapı
        int sayi2[][]=new int[5][6]; // 5*6 30 int değer saklayabilen yapı
        ArrayList<Integer>sayiList=new ArrayList<>(); // sitenildiği kadar int eğer saklayan yapı

/*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */


        //list create etme ve değer atama
        ArrayList<Integer>ListSayi=new ArrayList<>(); //boş int type list oluşturuldu
        // 1. yol-> add(); methodu
        ListSayi.add(10); // list ilk eleman olarak 10 değeri eklendi
        System.out.println(ListSayi);//10 değeri verir
        ListSayi.add(72);
        ListSayi.add(61);
        ListSayi.add(41);
        ListSayi.add(41); // list eleman tekrarını kabul eder
        System.out.println("ListSayi = " + ListSayi);//[10, 72, 61, 41, 41]

        // 2. yol->Arrays.asList();methodu
        ArrayList<String> listİsim=new ArrayList<>(Arrays.asList("Muharrem","Nur","Enise","Fatih"));//[Muharrem, Nur, Enise, Fatih]
        System.out.println("listİsim = " + listİsim);

        // 3. yolş List.of(); method

        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya","Amerika","ingiltere","iscev"));//
        ListSayi.add(2,14);// listde index 2'ye 14 değeri eklendi 2. indexteki eski eleman 1 index ileri kaydırıldı
        System.out.println("sayiList = " + ListSayi); //[10, 72, 14, 61, 41, 41]


    }
}
