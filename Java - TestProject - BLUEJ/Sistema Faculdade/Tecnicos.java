import java.util.Scanner;
public class Tecnicos extends Funcionario{
    String cargo;
    String departamento;
    
    Tecnicos(){
    }
  
    public void lerDados(){
        super.lerDados();
        System.out.println("***************************");
        System.out.println("DADOS DO TECNICO");
        Scanner s = new Scanner(System.in);
        System.out.println("Cargo do Tecnico:");
        this.cargo = s.nextLine();
        System.out.println("Departamento do Tecnico:");
        this.departamento = s.nextLine();
        /*System.out.println("Informe o nome:");
        super.nome = s.nextLine();
        System.out.println("Informe o Endereco:");
        super.endereco = s.nextLine();
        System.out.println("Informe o Telefone:");
        super.telefone = s.nextLine();
        System.out.println("Informe o CPF:");
        super.cpf = s.nextLine();
        System.out.println("Informe a CTPS:");
        super.ctps = s.nextLine();
        System.out.println("Informe o Salario:");
        super.salario = s.nextDouble();*/
        System.out.println("***************************");
}
    public void mostraDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO TECNICO");
        System.out.println("Nome: "+super.nome);
        System.out.println("Endereco:" +super.endereco);
        System.out.println("Telefone:" +super.telefone);
        System.out.println("CPF:" +super.cpf);
        System.out.println("Salario:" +super.salario);
        System.out.println("Cargo do Tecnico:"+this.cargo);
        System.out.println("Departamento do Tecnico:"+this.departamento);
        System.out.println("***************************");
    }
}
