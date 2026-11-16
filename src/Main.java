import exception.NegativeSalaryValue;

void main() {
    EmployeeManager employeeManager = new EmployeeManager();

    Scanner scanner = new Scanner(System.in);
    int option;

    do {
        System.out.println("Menu - Sistema de Gestão de Equipe:");
        System.out.println("1. Adicionar funcionário");
        System.out.println("2. Listar funcionários");
        System.out.println("3. Exibir salários finais");
        System.out.println("4. Funcionário com maior salário");
        System.out.println("5. Quantidade de funcionários por cargo");
        System.out.println("6. Buscar funcionário por nome");
        System.out.println("7. Sair");

        option = scanner.nextInt();
        switch (option) {
            case 1: {
                try {
                    System.out.println("Digite o nome do funcionário:");
                    String name = scanner.next();
                    System.out.println("Digite o salário base do funcionário:");
                    double baseSalary = scanner.nextDouble();
                    System.out.println("Digite o cargo do funcionário (DEVELOPER, PRODUCT_MANAGER, DEVOPS_ENGINEER):");
                    Role role = Role.valueOf(scanner.next().toUpperCase());
                    employeeManager.addEmployee(name, baseSalary, role);
                } catch (NegativeSalaryValue e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um cargo válido (DEVELOPER, PRODUCT_MANAGER, DEVOPS_ENGINEER).");
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número para o salário.");
                } catch (NoSuchElementException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            }
            case 2: {
                employeeManager.listEmployees();
                break;
            }
            case 3: {
                employeeManager.displayFinalSalaries();
                break;
            }
//            case 4:
//                employeeManager.displayHighestSalaryEmployee();
//                break;
//            case 5:
//                employeeManager.displayEmployeeCountByRole();
//                break;
//            case 6:
//                System.out.println("Digite o nome do funcionário que deseja buscar:");
//                String searchName = scanner.next();
//                employeeManager.searchEmployeeByName(searchName);
//                break;
            case 7:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        }while (option != 7);


    scanner.close();
    }


