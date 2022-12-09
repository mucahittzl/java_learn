package HalukHocaJava.j01_Variables.j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {

         /*
        TASK :
        fields -->   Universite (String)
                     bolum (String)
                     ogrcSayisi (int)
                     notOrt (int)
                     olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
        */

    public static void main(String[] args) {

        Universite u01=new Universite("bogazici","matematik",571,73);
        Universite u02=new Universite("İstanbul","matematik",622,89);
        Universite u03=new Universite("Marmara","hukuk",1453,52);
        Universite u04=new Universite("İtü","ucak muh.",333,63);
        Universite u05=new Universite("Yıldız Teknik","Gemi muh.",216,55);

        List<Universite>unv=new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));

        System.out.println("Task 01 :"+ortKontrol(unv));//false
        System.out.println("\n   ***   ");
        System.out.println("Task 02 :"+ogrcSys110azmı(unv));//true
        System.out.println("\n   ***   ");
        System.out.println("Task 03 :"+enAz1matVarMı(unv));//true
        System.out.println("\n   ***   ");
        System.out.println("Task 04 :"+ogcBK(unv));//ögrencı sayısına göre sıralar.
        System.out.println("\n   ***   ");
        System.out.println("Task 05 :"+unıIlk3(unv));// not ortalamasına gore ılk 3 unı
        System.out.println("\n   ***   ");
        System.out.println("Task 06 :"+ogrcEnaz2(unv));//[universite='İtü', bolum='ucak muh.', ogrcSayisi=333, notOrt=63]
        System.out.println("\n   ***   ");
        System.out.println("Task 07 :"+notOrt63BykOgrcSysToplam(unv));//1193
        System.out.println("\n   ***   ");
        System.out.println("Task 08 :"+ogrcSayısı333BykNotOrtlaması(unv));//71.33333333333333
        System.out.println("\n   ***   ");
        System.out.println("Task 09 :"+matBolumSayi(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task 10 :"+ogrc571FazlaUnıOrtlm(unv));
        System.out.println("\n   ***   ");
        System.out.println("Task 11 :"+ogrc1071azUnıEnazOrtlm(unv));
    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.

    public static boolean ortKontrol(List<Universite>unv){
       return unv.stream().allMatch(t->t.getNotOrt()>74);

    }

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.

    public static boolean ogrcSys110azmı(List<Universite>unv){
        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

    public static boolean enAz1matVarMı(List<Universite>unv){
        return unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("mat"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.

    public static List<Universite> ogcBK(List<Universite>unv){
        return unv.stream().
                 sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                 collect(Collectors.toList());//akıştaki elemanlar liste atandı
                //collect(Collectors.call)->Collector class'dan call edilen coll. meth ile akıs elemanları atanır
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

    public static List<Universite> unıIlk3(List<Universite>unv){
        return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).
                collect(Collectors.toList());
    }
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

    public static List<Universite> ogrcEnaz2(List<Universite>unv){
        return unv.stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi)).
                limit(2).skip(1).collect(Collectors.toList());
    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.

    public static int notOrt63BykOgrcSysToplam(List<Universite>unv){
        return unv.stream().
                filter(t->t.getNotOrt()>63).
                mapToInt(t->t.getOgrcSayisi()).//akıstakı elemanları data type'ını parametredewkı değere gore update eder
                sum();//akıstaki elemanlar toplanır
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.

    public static Double ogrcSayısı333BykNotOrtlaması(List<Universite>unv){
        return unv.stream().
                filter(t->t.getOgrcSayisi()>333).
                mapToDouble(t->t.getNotOrt()).//akıstakı elemanları data type'ını parametredekı değere gore update eder
                        average().getAsDouble();//akıstaki elemanların ortalaması alınır
    }

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.

    public static long matBolumSayi(List<Universite>unv){
        return unv.stream().filter(t->t.getBolum().equals("matematik")).count();
    }



    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    public static int ogrc571FazlaUnıOrtlm(List<Universite>unv){
        return unv.stream().filter(t->t.getOgrcSayisi()>571).
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                limit(1).mapToInt(t->t.getNotOrt()).sum();
    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.


    public static int ogrc1071azUnıEnazOrtlm(List<Universite>unv){
        return unv.stream().filter(t->t.getOgrcSayisi()<1071).
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                mapToInt(t->t.getNotOrt()).min().getAsInt();

    }
}
