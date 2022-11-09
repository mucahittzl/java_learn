package HalukHocaJava.j01_Variables.j11_Method_Creation;

public class C04_MethodCreaton {//depodan cod cekiyoruz

    public static void main(String[] args) {

        String name="haluk";
        C04_MethodDepo.gecmeNotu(24);//Depo class tan class name ile method call ettik.
    //bu yöntemi yaparken olusturulan code static olmalı

        topla(3,5);//8  ***aynı class tan methodName ile call ettik...***

        /*
        farklı class'dan method call etmek iççin..
        1. method static->gökteki göneş gibi herkese ortak
        2.ClassName.methodName() seklınde call edilir.
        3.aynı class'da methodName() ile call edilir.
         */

    }//main dışı
    public static void topla(int a,int b){
        System.out.println(a+b);
    }

}
