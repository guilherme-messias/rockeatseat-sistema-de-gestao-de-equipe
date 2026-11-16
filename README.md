# Sistema de Gestão de Equipe

Aplicação de console em Java para cadastrar e consultar funcionários de uma empresa de tecnologia. Os dados ficam armazenados em memória e são perdidos ao encerrar o programa.

## Funcionalidades

- Cadastrar funcionário com nome, salário base e cargo.
- Listar funcionários cadastrados.
- Exibir salários finais, incluindo o bônus.
- Encontrar o funcionário com maior salário final.
- Contabilizar funcionários por cargo usando um `HashMap`.
- Buscar funcionário pelo nome.
- Validar salários negativos.

Os bônus são definidos pelo enum `Role`:

| Cargo | Bônus |
|---|---:|
| `DEVELOPER` | 10% |
| `PRODUCT_MANAGER` | 20% |
| `DEVOPS_ENGINEER` | 15% |

## Requisitos

- JDK 25 ou superior, pois `Main.java` usa o formato compacto de arquivo-fonte Java.

## Como executar

No PowerShell, na pasta raiz do projeto, compile os arquivos:

```powershell
javac -d out src\Main.java src\Role.java src\Employee.java src\EmployeeManager.java src\exception\NegativeSalaryValue.java
```

Em seguida, inicie a aplicação:

```powershell
java -cp out Main
```

Também é possível abrir o projeto na IDE e executar `src\Main.java`, usando um JDK 25 ou superior.

## Uso

No menu, escolha uma opção de 1 a 7. Para cadastrar um funcionário, informe o nome, o salário base e um dos cargos exatamente como listado acima. Os salários são exibidos em formato de moeda brasileira.
