void main() {
    List<Employee> employees = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int option;

    do {
        System.out.println("Bem-vindo ao sistema de gestão de equipe:");
        System.out.println("1. Adicionar funcionário");
        System.out.println("2. Listar funcionários");
        System.out.println("3. Exibir salários finais");
        System.out.println("4. Funcionário com maior salário");
        System.out.println("5. Quantidade de funcionários por cargo");
        System.out.println("6. Buscar funcionário por nome");
        System.out.println("7. Sair");


        option = scanner.nextInt();
        switch (option) {}

        }while (option != 7);


    scanner.close();
    }


