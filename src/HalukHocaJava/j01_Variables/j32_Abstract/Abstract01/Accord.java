package HalukHocaJava.j01_Variables.j32_Abstract.Abstract01;

public class Accord extends Honda{

    @Override
    public void motor() {//implement abstract method
        System.out.println("Agam 2.0 turbo ateşle hız felakettir");
    }

    @Override
    void koltuk() {//implement abstract method
        System.out.println("deri koltuk ter yapar pişik olma");
    }

    @Override
    void sonroof() {//override edilen method
        System.out.println("agam cuğara yakınca sunroof açmayı unutma");
    }

    @Override
    void kapı() {//implement abstract method
        System.out.println("agam vakumlu kapı çarpılmayasan");
    }
}
