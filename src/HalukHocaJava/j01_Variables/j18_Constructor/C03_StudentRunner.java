package HalukHocaJava.j01_Variables.j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrc1=new C03_Student();//ogrc1 obj create edildi

        ogrc1.ad="Fatih";
        ogrc1.soyad="Ataş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;
        System.out.println("ogrc1 = " + ogrc1);//ogrc1 = HalukHocaJava.j01_Variables.j18_Constructor.C03_Student@5f2050f6 referans değerlerini verir

        ogrc1.mezuniyet();//agam diploman hayırlı olsun

        //task-> diğer bir öğrenci obj ile tüm fieldleri atayıp print ediniz

        C03_Student ogrc2=new C03_Student();
        ogrc2.ad="Mücahit";
        ogrc2.soyad="Tezel";
        ogrc2.sınıf=4;
        ogrc2.okulNo=587;
        ogrc2.takdir=true;
        System.out.println("ogrc2 = " + ogrc2);


    }
}
