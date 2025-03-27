interface Employee {
    double earnings();
    double deductions();
    double bonus();
}
class Manager implements Employee {
    double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        return basicSalary + (0.80 * basicSalary) + (0.15 * basicSalary);
    }

    public double deductions() {
        return 0.12 * basicSalary;
    }
    public double bonus() {
        return 0;
    }
}
class Substaff extends Manager {

    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double bonus() {
        return 0.50 * basicSalary;
    }
}
public class Program3 {
    public static void main(String[] args) {
        Substaff substaff = new Substaff(50000);
        System.out.println("Earnings - " + substaff.earnings());
        System.out.println("Deduction - " + substaff.deductions());
        System.out.println("Bonus - " + substaff.bonus());
    }
}
