import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, double baseSalary, Role role) {
        Employee employee = new Employee(name, baseSalary, role);
        employees.add(employee);
        System.out.println("Funcionário adicionado com sucesso: " + employee);
    }
}
