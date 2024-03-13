package Employee_Managementv2.Classes;

// Company.java

import java.util.List;

public class Company {
    private String companyName;
    private List<Department> listOfDepartments;
    private List<Employee> listOfEmployees;

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

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setListOfDepartments(List<Department> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
}

