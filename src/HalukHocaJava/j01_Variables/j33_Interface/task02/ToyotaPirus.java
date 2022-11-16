package HalukHocaJava.j01_Variables.j33_Interface.task02;

public class ToyotaPirus extends Vehicle implements Electric, Gas {

    @Override
    public void changeBattery() {
        System.out.println("toyota battery");
    }

    @Override
    public void chanceOil() {
        System.out.println("chance toyota car oil");
    }

    @Override
    public String drive() {
        return "toyota is so good";
    }

    public ToyotaPirus() {
        super.engine=1.6;
        super.model="avensis";
    }

    @Override
    public String toString() {
        return "ToyotaPirus{" +
                "model='" + model + '\'' +
                ", engine=" + engine +drive()+
                '}';

    }
}
