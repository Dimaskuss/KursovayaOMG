import java.io.OptionalDataException;

public class Main {

    static Employee employees[] = new Employee[10];


    public static void main(String[] args) {


        employees[0] = new Employee("Дима", 1, 99000);
        employees[1] = new Employee("Елена", 3, 43000);
        employees[2] = new Employee("Максим", 2, 39000);
        employees[3] = new Employee("Денис", 3, 54000);
        employees[4] = new Employee("Валенитин", 2, 62000);
        employees[5] = new Employee("Захар", 4, 31000);
        employees[6] = new Employee("Лидия", 3, 76000);
        employees[7] = new Employee("Ярослав", 2, 62000);
       employees[8] = new Employee("Никита", 4, 59000);
        employees[9] = new Employee("Дарина", 3, 48000);




    EmployeeService.printEmployee();
    }
}
