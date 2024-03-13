package Employee_Managementv2.Services;

// Service.java

import Employee_Managementv2.Classes.Company;
import Employee_Managementv2.Classes.Department;
import Employee_Managementv2.Classes.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {
    private static Company company;

    public Service(Company company) {
        this.company = company;
    }

    public void findMostSalaried() {
        Employee mostSalariedEmployee = company.getListOfEmployees().stream()
                .max((e1, e2) -> Integer.compare(e1.getEmpSalary(), e2.getEmpSalary()))
                .orElse(null);
        System.out.println("Most salaried person is: \n" + mostSalariedEmployee);
    }

//    public void groupByDepartment() {
//        Map<Department, List<Employee>> employeesByDepartment = company.getListOfEmployees().stream()
//                .collect(Collectors.groupingBy(Employee::getEmpDepartment));
//        System.out.println(employeesByDepartment);
//    }

    public void groupByDepartment() {
        Map<Department, List<Employee>> employeesByDepartment = company.getListOfEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getEmpDepartment));

        employeesByDepartment.forEach((department, employees) -> {
            System.out.println("Department: " + department.getDepartmentName());
            employees.forEach(employee -> System.out.println("\t" + employee));
            System.out.println();
        });
    }


    public void findEmployeeWithSameName() {
        Map<String, List<String>> employeeWithSameName = company.getListOfEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getEmpName,
                        Collectors.mapping(Employee::getEmpId, Collectors.toList())));
        System.out.println(employeeWithSameName);
    }

    public static Employee findManager(String managerName) {
        List<Employee> employees = company.getListOfEmployees();
        for (Employee employee : employees) {
            if (employee.getEmpName().equalsIgnoreCase(managerName)) {
                return employee;
            }
        }
        return null;
    }

    public void findReporteesOf(Employee manager) {
        List<String> reportees = company.getListOfEmployees().stream()
                .filter(e -> e.getManagerName() != null && e.getManagerName().equals(manager))
                .map(Employee::getEmpName)
                .collect(Collectors.toList());
        System.out.println(reportees);
    }
}

