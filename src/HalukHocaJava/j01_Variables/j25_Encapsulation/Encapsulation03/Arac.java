package HalukHocaJava.j01_Variables.j25_Encapsulation.Encapsulation03;

public class Arac {
    /*
            1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
               olan Araba  isimli bir class cretae ediniz.
            2- bütün fieldları parametre alan bir constructor tanımlayınız.
            3- Runner isminde main için bir class oluşturunuz.
            4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
            5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.*/

    //fields... 2.step
   private String model;
   private String renk;
   private int motor;
   private int yıl;

    //full parametreli constructor 2.step
    public Arac(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
       // this.motor = motor;
        setMotor(motor);//set method call edildi
       // this.yıl = yıl;
        setYıl(yıl);// set method call edildi
    }

    //parametresiz constructor 4. step
    public Arac() {
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bisiklete bineydin daha iyiydi");
            this.motor =1001;
        }else
        this.motor = motor;
    }

    public void setYıl(int yıl) {
        if (yıl<0){
            this.yıl=(-1)*yıl;
        }
       else this.yıl = yıl;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl;
    }
}
