package HalukHocaJava.j01_Variables.j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        //task->array eleöanlarının çarpımını print eden code create ediniz...->with foreach
        int arr[][]={{2,3,},{4},{5,6,7}};
        int çarpm=1;
        for (int kc[]:arr) {
            for (int a:kc) {
                çarpm*=a;
            }

        }
        System.out.println("çarpm = " + çarpm);


    }
}
