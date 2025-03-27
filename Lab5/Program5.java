package General;
public class Employee {
    protected int empId;
    private String empName;

    public void setDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public double earnings(double basicSalary) {
        return basicSalary + (0.80 * basicSalary) + (0.15 * basicSalary);
    }
}
