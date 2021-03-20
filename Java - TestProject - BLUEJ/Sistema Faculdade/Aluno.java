import java.util.Scanner;
public class Aluno{
    String nome;
    String matricula;
    String cpf;
    /*Curso curso;*/
    
    /*public Aluno(Curso curso){
        this.curso = curso;
    }*/

    public void lerDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO ALUNO");
        Scanner s = new Scanner(System.in);
        System.out.println("Nome do Aluno:");
        this.nome = s.nextLine();
        System.out.println("Matricula do Aluno:");
        this.matricula = s.nextLine();
        System.out.println("Cpf do Aluno:");
        this.cpf = s.nextLine();
        System.out.println("***************************");
    }
    public void mostraDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO ALUNO");
        System.out.println("Nome do Aluno:"+this.nome);
        System.out.println("Matricula do Aluno:"+this.matricula);
        System.out.println("CPF do Aluno:"+this.cpf);
        /*System.out.println("Curso do Aluno:"+this.curso.getNome());*/
        System.out.println("***************************");
    }
}