package HalukHocaJava.j01_Variables.j33_Interface.task02;

public class Bus extends Vehicle implements Diesel{
    @Override
    public void chanceDiesel() {
        System.out.println("bus run for diesel");
    }

    @Override
    public String drive() {
        return "bus is big";
    }

    public Bus() {
        super.engine=5.0;
        super.model="MAN";
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
