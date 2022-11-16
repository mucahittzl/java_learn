package HalukHocaJava.j01_Variables.j33_Interface;

public interface dısDonanım {

    public void kapi();//abs. method

    void kaporta();//abs method

    final String RENK = "opak gırmızı";//public static final variable

    public default String sisLamp() {
        return "sisli havada dikkat";
    }
    static void anten(){
        System.out.println("agam yine antin kuntin işlerdesin");
    }
  //  public static default void sorunMethod(){// CTE verir static keyword aynı anda kullanılamaz
  //
  //  }
    //dısDonanım obj=new dısDonanım();//can not be instantiated -> obj olmaz
   // public static void main(String[] args) {//bad practise ->proje de tek bir main method ve main class kullanılmalı
   //     System.out.println("RENK = " + RENK);
   //     aga();//static method call edildi
   // }


}