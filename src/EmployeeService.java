public class EmployeeService {
    private static final Employee[] EMPLOYEES = new Employee[10];

    {


        EMPLOYEES[0] = new Employee("Дима", 1, 99000);
        EMPLOYEES[1] = new Employee("Елена", 2, 43000);
        EMPLOYEES[2] = new Employee("Максим", 1, 39001);
        EMPLOYEES[3] = new Employee("Денис", 3, 54000);
        EMPLOYEES[4] = new Employee("Валенитин", 5, 62001);
        EMPLOYEES[5] = new Employee("Захар", 5, 31000);
        EMPLOYEES[6] = new Employee("Лидия", 4, 76000);
        EMPLOYEES[7] = new Employee("Ярослав", 2, 62000);
        EMPLOYEES[8] = new Employee("Никита", 4, 59000);
        EMPLOYEES[9] = new Employee("Дарина", 3, 48000);
    }


    //    пробник по наличию людей в отделе
    public int availableNumberDepartment(int dep) {
        int counter = 0;
        for (int i = 0; i < EMPLOYEES.length  ; i++) {
            if (EMPLOYEES[i].getNumberDepartment() == dep) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("В этом департаменте нет ни одного сотрудника .");
        }
        return counter;
    }


    public void printEmployee() {

        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] == null) {
                continue;
            }
            System.out.println(EMPLOYEES[i].toString());
        }
    }

    public int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            sum = sum + EMPLOYEES[i].getSalary();
        }
        return sum;
    }

    public Employee getMaxSalary() {
        Employee result = EMPLOYEES[0];
        int maxSalary = EMPLOYEES[0].getSalary();
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            Employee employee = EMPLOYEES[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = EMPLOYEES[i];
            }
        }
        return result;

    }

    public Employee getMinSalary() {
        Employee result = EMPLOYEES[0];
        int minSalary = Employee.maxxx;
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            Employee employee = EMPLOYEES[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = EMPLOYEES[i];
            }
        }
        return result;

    }

    public float getAverageSalarySum() {
        float sum = 0;
        float maxLength = 0;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (maxLength <= i) {    //это чтобы не делить на длинну массива , а сосчитать длинну по пути
                maxLength = i + 1;
            }
            sum = sum + EMPLOYEES[i].getSalary();
        }
        sum = sum / maxLength;
        return sum;
    }

    public void printNameEmployee() {

        for (int i = 0; i < EMPLOYEES.length ; i++) {
            System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getName());
        }
    }

    // Повышенная сложность
    public void getSalaryIndex(double indexPersent) {
        double indexedSalary;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            indexedSalary = EMPLOYEES[i].getSalary() + ((EMPLOYEES[i].getSalary() * indexPersent) / 100);
            System.out.println(indexedSalary);
        }
    }

    public Employee getDepartmentSalaryMax(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        Employee result = EMPLOYEES[0];
        int maxSalary = Employee.minnn;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (departmentId == EMPLOYEES[i].getNumberDepartment() && EMPLOYEES[i].getSalary() > maxSalary) {
                maxSalary = EMPLOYEES[i].getSalary();
                result = EMPLOYEES[i];
            }
        }
        return result;
    }

    public Employee getDepartmentSalaryMin(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");

        }
        int counter = 0;
        Employee result = EMPLOYEES[0];
        int minSalary = Employee.maxxx;
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (EMPLOYEES[i].getSalary() < minSalary && departmentId == EMPLOYEES[i].getNumberDepartment()) {
                minSalary = EMPLOYEES[i].getSalary();
                counter++;
                result = EMPLOYEES[i];
            }
        }

        if (counter == 0) {
            minSalary = counter;
            System.out.println("В этом отделе нет сотрудников.");
        }
        return result;
    }

    public int getDepartmentSalarySum(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        int sum = 0;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (departmentId == EMPLOYEES[i].getNumberDepartment()) {
                sum = sum + EMPLOYEES[i].getSalary();
            }
        }
        return sum;

    }

    public float calculateAvarageDepartmentSalary(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        float mambers = 0;
        float sum = 0;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (departmentId == EMPLOYEES[i].getNumberDepartment()) {
                sum = sum + EMPLOYEES[i].getSalary();
                mambers++;
            }
        }
        return sum / mambers;
    }

    public void indexDepartmentSalary(int departmentId, double indexPersent) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        double indexedSalary = 0;
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (departmentId == EMPLOYEES[i].getNumberDepartment()) {
                indexedSalary = EMPLOYEES[i].getSalary() + ((EMPLOYEES[i].getSalary() * indexPersent) / 100);
                System.out.println(indexedSalary);
            }
        }
    }

    public void printDepartmentEmployee(int departmentId) {
        if (departmentId < 0 || departmentId > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (departmentId == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].getName() + " " + EMPLOYEES[i].getSalary() + " " + EMPLOYEES[i].getId());
            }
        }
    }

    public void printEmployeesSalaryMoreThen(int salary) {
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (salary < EMPLOYEES[i].getSalary()) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getName() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }

    public void printEmployeesSalaryLessThen(int salary) {
        for (int i = 0; i < EMPLOYEES.length ; i++) {
            if (salary >= EMPLOYEES[i].getSalary()) {
                System.out.println(EMPLOYEES[i].getId() + " " + EMPLOYEES[i].getName() + " " + EMPLOYEES[i].getSalary());
            }
        }
    }


    // Очень сложно !!!!
    public void addNewEmployee(String name, int numberDepartment, int salary) {

        int i = 0;

        while (i < EMPLOYEES.length - 1 && EMPLOYEES[i] != null) {
            i++;
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = new Employee(name, numberDepartment, salary);
                break;
            }
            if (i == EMPLOYEES.length - 1) {
                System.out.println("Хранилище заполненно!!!");
            }
        }
    }

    public void deleteEmployee(String name, int id) {
// если совпадали значения одновременно и имени и id , но это были разные ячейки, программа удаляла обе ,
// не нашел ничего умнее чем выделить приоритет, но это тоже не совсем устраивает ((
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (EMPLOYEES[i].getName().equals(name)) {
                EMPLOYEES[i] = null;
                break;
            } else if (EMPLOYEES[i].getId() == id) {
                EMPLOYEES[i] = null;
            }
        }
    }

    public void changeSalary(String name, int newSalary) {
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (EMPLOYEES[i].getName().equals(name)) {
                EMPLOYEES[i].setSalary(newSalary);
            }
        }
    }

    public void changeDepartmentid(String name, int newDepartment) {
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (EMPLOYEES[i].getName().equals(name)) {
                EMPLOYEES[i].setNumberDepartment(newDepartment);
            }
        }
    }
// сорри за такое исполнение , но я уже все ))) Как это можно сделать изящнее ??
    public void printNamesForDepartment() {
        int departCount = 1;
        System.out.println("отдел 1");
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (departCount == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].toString());
            }
        }
        departCount++;
        System.out.println("отдел 2");
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (departCount == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].toString());
            }
        }
        departCount++;
        System.out.println("отдел 3");
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (departCount == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].toString());
            }
        }
        departCount++;
        System.out.println("отдел 4");
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (departCount == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].toString());
            }
        }
        departCount++;
        System.out.println("отдел 5");
        for (int i = 0; i < EMPLOYEES.length && EMPLOYEES[i] != null; i++) {
            if (departCount == EMPLOYEES[i].getNumberDepartment()) {
                System.out.println(EMPLOYEES[i].toString());
            }
        }
    }
}
