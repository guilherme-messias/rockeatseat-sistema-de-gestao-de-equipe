import java.util.Objects;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary, Role role) {
        this.name = name;
        verifySalary(baseSalary);
        this.baseSalary = baseSalary;
        this.role = role;
    }

    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        verifySalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private void verifySalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(baseSalary, employee.baseSalary) == 0 && Objects.equals(name, employee.name) && role == employee.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseSalary, role);
    }

    @Override
    public String toString() {
        return String.format("Funcionário{Nome='%s', Salário Base =%.2f, Cargo=%s}", name, baseSalary, role);
    }
}
