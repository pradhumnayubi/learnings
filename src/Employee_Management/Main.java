package Employee_Management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department hr = new Department("1","HR Department");
        Department sales = new Department("2","Sales");

        Employee e1 = new Employee("01","Alice",hr, null, 1200);
        Employee e2 = new Employee("02","John",hr,e1,1000);
        Employee e3 = new Employee("03","Bob",sales, null, 1500);
        Employee e4 = new Employee("04","Mary",sales,e3,1300);
        Employee e5 = new Employee("05", "Alice", sales, null,1600);
        Employee e6 = new Employee("06","Ryan", hr, e1, 2000);


        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(sales);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        Company company = new Company("Yubi",departments, employees);

        Service service = new Service(company);
        service.findMostSalaried();
        System.out.println();
        service.groupByDepartment();
        System.out.println();
        service.findEmployeeWithSameName();
        System.out.println();
        service.findReporteesOf(e1);

    }
}
