package HalukHocaJava.j01_Variables.j33_Interface.task02;

public class TeslaCar extends Vehicle implements Electric {




    @Override
    public void changeBattery() {
        System.out.println("needed Battery");
    }

    @Override
    public String drive() {
        return "ready to go";
    }

    public TeslaCar() {
        super.engine=1.6;
        super.model="model X";
    }

    @Override
    public String toString() {
        return "TeslaCar{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
