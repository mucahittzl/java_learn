package HalukHocaJava.j01_Variables.j24_AccessModifier.farklıPackage;

import HalukHocaJava.j01_Variables.j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateTeamlead="Hakan Aydın";
    String defaultName="Cebrail bey";

    protected String protectedName="Dilek Hanım";
    public String publicName="Gamze Hanım";

    public static void main(String[] args) {


        C01_AccessModifier obj9=new C01_AccessModifier(23,63);//public cons.
        System.out.println("obj9.publicYas = " + obj9.publicYas);// public variable
        // obj9.defaltYas // default variable package dışı erişilmez
        //obj9.protectedMethod() //protected method package dışı call edilemez

    }
}
