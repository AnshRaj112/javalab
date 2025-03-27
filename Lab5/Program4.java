interface Employee {
    void getDetails();
}
interface Manager extends Employee {
    void getDeptDetails();
}
class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void getDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }

    public void getDeptDetails() {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
    public void printDetails() {
        getDetails();
        getDeptDetails();
    }
}
public class Program4 {
    public static void main(String[] args) {
        Head head = new Head(123, "Sidharth Ambani", 6, "Marketing");
        head.printDetails();
    }
}
