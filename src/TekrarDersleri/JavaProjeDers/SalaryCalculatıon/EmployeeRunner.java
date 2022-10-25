package TekrarDersleri.JavaProjeDers.SalaryCalculatıon;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee=new Employee("Drake",20000,41,2020);
        System.out.println("name:"+employee.name);
        System.out.println("Maas:"+employee.salary);
        System.out.println("ödenecek vergi = " + employee.tax()+"$");
        System.out.println("ödenece Bonus :"+employee.bonus()+"$");
        System.out.println("maaş artışı :"+employee.raiseSalary()+"$");

        System.out.println("toplam ödenecek ücret."+((employee.salary)+(employee.raiseSalary())));
        System.out.println("employee = " + employee.toString());
    }
}
