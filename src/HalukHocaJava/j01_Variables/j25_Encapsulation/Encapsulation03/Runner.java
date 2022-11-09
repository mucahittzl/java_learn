package HalukHocaJava.j01_Variables.j25_Encapsulation.Encapsulation03;

public class Runner {// 3. step
    public static void main(String[] args) {

        // 4. step
    Arac honda=new Arac("accord","siyah",-200,2012);
    Arac volvo=new Arac("s80","beyaz",2000,-2015);
    Arac hacimurat=new Arac();

        hacimurat.setModel("serçe");
        hacimurat.setMotor(1300);
        hacimurat.setYıl(1974);
        hacimurat.setRenk("cücük sarı");
        System.out.println("honda hayat onda :"+honda);
        System.out.println("hacimurat :"+hacimurat);
        System.out.println("volvo :"+volvo);
    }
}

