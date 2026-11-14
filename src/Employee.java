public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary, Role role) {
        this.name = name;
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
        this.baseSalary = baseSalary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
