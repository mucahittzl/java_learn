package HalukHocaJava.j01_Variables.j14_Scope;

public class C03_Scope {



    public static void main(String[] args) {

C01_InstanceVariable kus= new C01_InstanceVariable(); //istediğimiz class tan kus bojesını create ettik
kus.name="ebabil";
kus.developerMı=false;

        System.out.println(kus.name);// ebabil verir
        C01_InstanceVariable.staticMethod(); //classname ile static method call ettik
        kus.non_staticMethod(); //obje ile static olmayan method call edilebilir





    }//main sonu


}
