package HalukHocaJava.j01_Variables.j32_Abstract.Abstract01;

public abstract class Honda {// parent abs class

    public abstract void motor();
     void sonroof(){
         System.out.println("agam keyfini bilirsen ama sunroof extra ücretli");
     }
     //abs parent class'da variable tanımlanabilir mi?
    String name="Gülsüm team lead";//tanımlanır
    // Variableler abstract tanımlanır mı?
    // public abstract int yas=48; ->Kesinlikle hayır

    abstract void koltuk();
    abstract void kapı();

    // final void finalMethod();//concrete method body'siz olamaz
    // final abstract void finalMethod();//abs method final olamaz

    // private void privemethod();//concrete method body'siz olamaz
    // private abstract void privemethod();//abs method private olamaz

    // static void gunesMethod();//concrete method body'siz olamaz
    // static abstract void gunesMethod();//abs method static olamaz

    // Honda obj=new Honda(); // abs class obje üretemez







}
