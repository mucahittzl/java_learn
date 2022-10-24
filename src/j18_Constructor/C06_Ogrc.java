package j18_Constructor;

public class C06_Ogrc {


    String isim="Merwe Hanım";
    int yas;
    String name;
    int age;

    public C06_Ogrc(String isim, int yas) {// 2 parametreli constructor
       // this.isim = isim;//parametre isim değeri inst. obj isim değerine atandı
       // this.yas = yas;//parametre yas değeri inst. obj yas edğerine atandı
        isim = isim;//parametre isim yine parametre isme atandı inst. obj isim değeri değişmedi
        yas = yas;//parametre yas yine parametre yas atandı inst. obj yas değeri değişmedi
      //  name=isim;//parametre isim değeri inst. obj name edğerine atandı
      //  age=yas;//parametre yas değeri inst. obj age edğerine atandı
        System.out.println("cons'taki name :"+isim);//parametre isim değeri:Saliha H
        System.out.println("cons'taki isim :"+this.isim);//inst. obj isim değeri:Merwe Hanım
        System.out.println("cons'taki name :"+name);//inst. obj name değeri : null

    }
}
