import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility{
    private String emp_id;
    private String emp_name;

    public Employees() {
    }

    public Employees(String emp_id, String emp_name, int emp_age, String emp_department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_department = emp_department;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_department() {
        return emp_department;
    }

    public void setEmp_department(String emp_department) {
        this.emp_department = emp_department;
    }

    private int emp_age;
    private String emp_department;


    @Override
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
        System.out.println("Showroom Name: "+getShowroom_name());

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        setShowroom_name(sc.nextLine());


    }
}
