package HalukHocaJava.j01_Variables.j19_StaticVariable.ödevTask1;

public class C01_Rectangle {

    private int width, length;

    public C01_Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double cevre(){
        double cevre=width+length+(Math.sqrt((length*length)+(width*width)));
        return cevre;
    }
    public double alan(){
        double alan=width*length/2;
        return alan;
    }











}
