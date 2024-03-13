package Employee_Managementv2.Classes;

import java.util.Objects;

public class Department {
        private String departmentId;
        private String departmentName;

        public Department(String departmentId, String departmentName) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }

        public String getDepartmentId() {
            return departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "departmentId='" + departmentId + '\'' +
                    ", departmentName='" + departmentName + '\'' +
                    "}";
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}
