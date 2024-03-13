package Employee_Management;

import java.util.List;
import java.util.Map;

public class Service {
    private Company companyName;

    public Service(Company companyName) {
        this.companyName = companyName;
    }

    public void findMostSalaried(){
        Employee mostSalariedEmployee = companyName.findMostSalariedEmployee();
        System.out.println("Most salaried person is: " + mostSalariedEmployee);
    }

    public void groupByDepartment(){
        Map<Department, List<Employee>> employeesByDepartment = companyName.getEmployeeByDepartment();
        System.out.println(employeesByDepartment);
    }

    public void findEmployeeWithSameName(){
        Map<String,List<String>> employeeWithSameName = companyName.findEmployeeWithSameName();
        System.out.println(employeeWithSameName);
    }

    public void findReporteesOf(Employee manager){
        List<String> reportees = companyName.findReportees(manager);
        System.out.println(reportees);
    }
}
