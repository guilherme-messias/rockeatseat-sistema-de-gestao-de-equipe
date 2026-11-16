import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void displayEmployeeCountByRole() {
        Map<Role, Integer> roleCountMap = new HashMap<>();
        if (employees.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            int developerCount = 0;
            int productManagerCount = 0;
            int devOpsEngineerCount = 0;

            for (Employee employee : employees) {
                switch (employee.getRole()) {
                    case DEVELOPER:
                        developerCount++;
                        break;
                    case PRODUCT_MANAGER:
                        productManagerCount++;
                        break;
                    case DEVOPS_ENGINEER:
                        devOpsEngineerCount++;
                        break;
                }
            }

            roleCountMap.put(Role.DEVELOPER, developerCount);
            roleCountMap.put(Role.PRODUCT_MANAGER, productManagerCount);
            roleCountMap.put(Role.DEVOPS_ENGINEER, devOpsEngineerCount);

            System.out.println("Quantidade de funcionários por cargo:");
            System.out.println("Desenvolvedores: " + roleCountMap.getOrDefault(Role.DEVELOPER, 0));
            System.out.println("Gerentes de Produto: " + roleCountMap.getOrDefault(Role.PRODUCT_MANAGER, 0));
            System.out.println("Engenheiros DevOps: " + roleCountMap.getOrDefault(Role.DEVOPS_ENGINEER, 0));
        }
    }

    public void searchEmployeeByName(String name) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println("Funcionário encontrado:");
                System.out.println("Nome: " + employee.getName());
                System.out.println("Salário Base: " + employee.getBaseSalary());
                System.out.println("Cargo: " + employee.getRole());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private double calculateFinalSalary(Employee employee) {
        double bonus = employee.getRole().calculateBonus(employee.getBaseSalary());
        return employee.getBaseSalary() + bonus;
    }
}
