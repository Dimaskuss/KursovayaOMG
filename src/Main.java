public class Main {

    static Employee[] employees = new Employee[10];


    public static void main(String[] args) {


        employees[0] = new Employee("Дима", 1, 99000);
        employees[1] = new Employee("Елена", 3, 43000);
        employees[2] = new Employee("Максим", 4, 39001);
        employees[3] = new Employee("Денис", 3, 54000);
        employees[4] = new Employee("Валенитин", 2, 62001);
        employees[5] = new Employee("Захар", 5, 31000);
        employees[6] = new Employee("Лидия", 4, 76000);
        employees[7] = new Employee("Ярослав", 2, 62000);
        employees[8] = new Employee("Никита", 4, 59000);
        employees[9] = new Employee("Дарина", 3, 48000);


        printEmployee();
        getSalarySum();
        getMaxSalary();
        getMinSalary();
        System.out.println(employees[2].getName());
        getAverageSalarySum();
        getMinSalary();
        printNameEmployee();
        getSalaryIndex(99.9);
        getMinSalary();
        getDepartmentSalaryMax(2);
        getDepartmentSalaryMin(2);
        getDepartmentSalarySum(2);
        calculateAvarageDepartmentSalary(2);
        calculateAvarageDepartmentSalary(3);
        indexDepartmentSalary(2, 10.32);
        printDepartmentEmployee(2);
        printEmployeesSalaryLessThen(50000);
        System.out.println();
        printEmployeesSalaryMoreThen(50000);
    }

    public static void printEmployee() {

        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static void getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println(sum);
    }

    public static void getMaxSalary() {
        int maxSalary = Employee.minnn;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println(maxSalary);

    }

    public static void getMinSalary() {
        int minSalary = Employee.maxxx;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println(minSalary);

    }

    public static void getAverageSalarySum() {
        float sum = 0;
        float maxLength = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (maxLength <= i) {
                maxLength = i + 1;
            }
            sum = sum + employees[i].getSalary();
        }
        sum = sum / maxLength;
        System.out.println(sum);
    }

    public static void printNameEmployee() {

        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            System.out.println(employees[i].getId() + " " + employees[i].getName());
        }
    }

    // Повышенная сложность
    public static void getSalaryIndex(double indexPersent) {
        double indexedSalary;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            indexedSalary = employees[i].getSalary() + ((employees[i].getSalary() * indexPersent) / 100);
            System.out.println(indexedSalary);
        }
    }

    public static void getDepartmentSalaryMax(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        int maxSalary = Employee.minnn;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment() && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println(maxSalary);
    }

    public static void getDepartmentSalaryMin(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        int minSalary = Employee.maxxx;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment() && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println(minSalary);
    }

    public static void getDepartmentSalarySum(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        int sum = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment()) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println(sum);

    }

    public static void calculateAvarageDepartmentSalary(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        float mambers = 0;
        float sum = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment()) {
                sum = sum + employees[i].getSalary();
                mambers++;
            }
        }
        System.out.println(sum / mambers);
    }

    public static void indexDepartmentSalary(int departmentId, double indexPersent) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        double indexedSalary = 0;
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment()) {
                indexedSalary = employees[i].getSalary() + ((employees[i].getSalary() * indexPersent) / 100);
                System.out.println(indexedSalary);
            }
        }
    }

    public static void printDepartmentEmployee(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (departmentId == employees[i].getNumberDepartment()) {
                System.out.println(employees[i].getName() + " " + employees[i].getSalary() + " " + employees[i].getId());
            }
        }
    }

    public static void printEmployeesSalaryMoreThen(int salary) {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (salary < employees[i].getSalary()) {
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }

    public static void printEmployeesSalaryLessThen(int salary) {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if (salary >= employees[i].getSalary()) {
                System.out.println(employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getSalary());
            }
        }
    }
}