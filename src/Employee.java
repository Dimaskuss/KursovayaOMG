import java.util.Objects;

public class Employee {

    private final String name;
    private int numberDepartment;
    private int salary;
    private final int id;
    private static int counter;


    public Employee(String name, int numberDepartment, int salary) {
        if (numberDepartment < 0 || numberDepartment > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.name = name;
        this.numberDepartment = numberDepartment;
        this.salary = salary;
        counter++;
        this.id = counter;

    }

    private int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public  int getSalary() {
        return salary;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

     @Override
    public  String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numberDepartment=" + numberDepartment +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }


    }


