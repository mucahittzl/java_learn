package HalukHocaJava.j01_Variables.j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {


        //C01_AccessModifier obj1=new C01_AccessModifier();//private parametresiz cons call edilemez.
        C01_AccessModifier obj2=new C01_AccessModifier(23,45);//public 2p'li cons call edildi

        C02_AccessModifier semra=new C02_AccessModifier();
        // C01_AccessModifier obj4=new C01_AccessModifier();//C01_AccessModifier p'siz call edilemez

        System.out.println("obj2.defaultYas = " + obj2.defaultYas);
        obj2.protectedMethod();
        System.out.println("obj2.publicYas = " + obj2.publicYas);
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);
        // obj2.privateMethod();//privateMethod() call edilemez


    }
}
