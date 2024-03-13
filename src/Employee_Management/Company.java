package Employee_Management;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
    private String companyName;

    private List<Department> listOfDepartments;

    private List<Employee> listOfEmployees;

    @Override
    public String toString() {
        return "Company{" +
                "listOfDepartments=" + listOfDepartments +
                ", listOfEmployees=" + listOfEmployees +
                '}';
    }

    public Company(String companyName, List<Department> listOfDepartments, List<Employee> listOfEmployees) {
        this.companyName = companyName;
        this.listOfDepartments = listOfDepartments;
        this.listOfEmployees = listOfEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public Employee findMostSalariedEmployee(){
        return listOfEmployees.stream()
                .max(Comparator.comparingInt(Employee::getEmpSalary))
                .orElse(null);
    }

    public Map<Department, List<Employee>> getEmployeeByDepartment(){
        return listOfEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getEmpDepartment));
    }

    public Map<String, List<String >> findEmployeeWithSameName(){
        return listOfEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getEmpName,
                        Collectors.mapping(Employee::getEmpId, Collectors.toList())));
    }

    public List<String > findReportees(Employee manager){
        return listOfEmployees.stream()
                .filter(e -> e.getManagerName() != null && e.getManagerName().equals(manager))
                .map(Employee::getEmpName)
                .collect(Collectors.toList());
    }


}
