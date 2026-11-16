import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, double baseSalary, Role role) {
        Employee employee = new Employee(name, baseSalary, role);
        employees.add(employee);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de funcionários:");
            for (Employee employee : employees) {
                System.out.println("Nome: " + employee.getName());
                System.out.println("Salário Base: " + employee.getBaseSalary());
                System.out.println("Cargo: " + employee.getRole());
                System.out.println("-------------------------");
            }
        }
    }
}
