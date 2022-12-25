public class EmployeeService {


    public static void printEmployee() {
        for (int i = 0; i < Main.employees.length && Main.employees[i] != null ; i++) {
            System.out.println(Main.employees[i].toString());
        }

    }
}