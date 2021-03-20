import java.util.Scanner;
public class Funcionario
{
    String nome;
    String endereco;
    String telefone;
    String cpf;
    String ctps;
    double salario;

    public void lerDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO FUNCIONARIO");
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario:");
        this.nome = s.nextLine();
        
        System.out.println("Digite o endereço do funcionario:");
        this.endereco = s.nextLine();
        
        System.out.println("Digite o telefone do funcionario:");
        this.telefone = s.nextLine();
        
        System.out.println("Digite o cpf do funcionario:");
        this.cpf = s.nextLine();
        
        System.out.println("Digite a CTPS do funcionario:");
        this.ctps = s.nextLine();
        
        System.out.println("Digite o salario do funcionario:");
        this.salario = s.nextDouble();
        System.out.println("***************************");
}
    public void mostrarDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO FUNCIONARIO");
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereco: "+this.endereco);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("cpf: "+this.cpf);
        System.out.println("ctps: "+this.ctps);
        System.out.println("salario: "+this.salario);
        System.out.println("***************************");
    }
}