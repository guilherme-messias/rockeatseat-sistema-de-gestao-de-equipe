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

    public void displayFinalSalaries() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Salários finais dos funcionários:");
            for (Employee employee : employees) {
                double finalSalary = calculateFinalSalary(employee);
                System.out.println("Nome: " + employee.getName() + " - Salário Final: " + finalSalary);
            }
        }
    }

    public void displayHighestSalaryEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            Employee highestSalaryEmployee = employees.get(0);
            for (Employee employee : employees) {
                if (calculateFinalSalary(employee) > calculateFinalSalary(highestSalaryEmployee)) {
                    highestSalaryEmployee = employee;
                }
            }
            System.out.println("Funcionário com maior salário:");
            System.out.println("Nome: " + highestSalaryEmployee.getName());
            System.out.println("Salário Final: " + calculateFinalSalary(highestSalaryEmployee));
        }
    }

    private double calculateFinalSalary(Employee employee) {
        double bonus = employee.getRole().calculateBonus(employee.getBaseSalary());
        return employee.getBaseSalary() + bonus;
    }
}
