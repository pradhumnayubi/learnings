package Employee_Management;

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

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empDepartment=" + empDepartment +
                ", managerName=" + managerName +
                ", empSalary=" + empSalary +
                "\n";
    }
}
