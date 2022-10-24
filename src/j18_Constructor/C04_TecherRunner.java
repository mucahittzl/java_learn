package j18_Constructor;

public class C04_TecherRunner {
    public static void main(String[] args) {


       C04_Teacher ogrt1=new C04_Teacher();//ogrt1 obj create edildi
       ogrt1.ad="Muharrem";
       ogrt1.soyad="Güzel";
       ogrt1.branş="QA";
       ogrt1.emekli=false;
       ogrt1.maaş=23000;
       ogrt1.tecrübe=11;
       ogrt1.dersSaati();
        System.out.println(ogrt1);

        C04_Teacher ogrt2=new C04_Teacher("ugur","javacan","dev",15,100000,333,false);
        System.out.println(ogrt2);//{ad='ugur', soyad='javacan', branş='dev', maaş=15.0, tecrübe=100000, id=333, emekli=false}
    }
}
