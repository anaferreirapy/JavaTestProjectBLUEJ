import java.util.Scanner;
public class Professor extends Funcionario
{
    String titulacao;
    String areaPesquisa;
    
    public String getNome(){
        return super.nome;
    }
    public Professor(){
    }
    public void lerDados(){
        super.lerDados();
        Scanner s = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("DADOS DO PROFESSOR");
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
        super.salario = s.nextDouble();
        */
        System.out.println("Informe a titulacao:");
        this.titulacao = s.nextLine();
        System.out.println("Informe a area de pesquisa:");
        this.areaPesquisa = s.nextLine();
        System.out.println("***************************");
    }
    public void mostraDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO PROFESSOR");
        System.out.println("Nome: "+super.nome);
        System.out.println("Endereco:" +super.endereco);
        System.out.println("Telefone:" +super.telefone);
        System.out.println("CPF:" +super.cpf);
        System.out.println("CTPS:" +super.cpf );
        System.out.println("Salario:" +super.salario);
        System.out.println("Titulacao: "+this.titulacao);
        System.out.println("Area de Pesquisa: "+this.areaPesquisa);
        System.out.println("***************************");
}
}