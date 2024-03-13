package Employee_Managementv2;



import Employee_Managementv2.Classes.Company;
import Employee_Managementv2.Classes.Department;
import Employee_Managementv2.Classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    public static Company createCompany() {
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

        return new Company("Yubi", departments, employees);
    }
}

