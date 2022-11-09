package HalukHocaJava.j01_Variables.j26_Inheritance.Inheritance02.Task02;

public class SubClass extends SuperClass{
    public static void main(String[] args) {

       SubClass obj=new SubClass();
       obj.my_method();

    }
    int num=10;

    @Override
    public void göster() {
        System.out.println("bu method sub class'ın goruntuleme methodudur");
    }
    public void  my_method(){
        göster();//subclass call
        super.göster();//superclass call
        System.out.println("subClass num ="+num);
        System.out.println("superClass num ="+super.num);
    }
}

