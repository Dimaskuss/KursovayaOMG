public class Main {


    public static void main(String[] args) {
        EmployeeService EMPLOYEE = new EmployeeService();

//        EMPLOYEE.getSalarySum();
//        EMPLOYEE.printNameEmployee();
//        EMPLOYEE.calculateAvarageDepartmentSalary(2);
//        EMPLOYEE.addNewEmployee("Димончик",1,98000);
//        EMPLOYEE.printEmployee();
//

//   EMPLOYEE.deleteEmployee("Дима",2);
//    EMPLOYEE.changeSalary("Лидия",999999);
//        EMPLOYEE.printNamesForDepartment();
        System.out.println(EMPLOYEE.availableNumberDepartment(1));
        System.out.println(EMPLOYEE.getSalarySum());
        System.out.println(EMPLOYEE.getMaxSalary());
        System.out.println(EMPLOYEE.getMinSalary());
        System.out.println(EMPLOYEE.getDepartmentSalaryMin(2));
        System.out.println(EMPLOYEE.getDepartmentSalaryMax(2));
    }


}


