package Employee_Managementv2.Classes;


import java.util.Objects;

public class Employee {
    private String empId;
    private String empName;
    private Department empDepartment;
    private Employee managerName;
    private int empSalary;

    public Employee(String empId, String empName, Department empDepartment, Employee managerName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.managerName = managerName;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    public Employee getManagerName() {
        return managerName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDepartment(Department empDepartment) {
        this.empDepartment = empDepartment;
    }

    public void setManagerName(Employee managerName) {
        this.managerName = managerName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId='" + empId + '\'' +
//                ", empName='" + empName + '\'' +
//                ", empDepartment=" + empDepartment.getDepartmentName() + // Changed to get department name
//                ", manager=" + (managerName != null ? managerName.getEmpName() : "None") + // Changed to get manager name
//                ", empSalary=" + empSalary +
//                '}';
//    }

    @Override
    public String toString() {
        String managerInfo = (managerName != null) ? managerName.getEmpName() + " (ID: " + managerName.getEmpId() + ")" : "None";
        return "Employee{" +
                "ID: '" + empId + '\'' +
                ", Name: '" + empName + '\'' +
                ", Department: " + empDepartment.getDepartmentName() +
                ", Manager: " + managerInfo +
                ", Salary:" + empSalary +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}

