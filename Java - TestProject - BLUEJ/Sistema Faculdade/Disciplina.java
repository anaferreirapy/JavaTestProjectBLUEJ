import java.util.Scanner;
public class Disciplina
{
    int codigo;
    String nome;
    int carga_horaria;
    Curso curso;
    Professor professor;
    Disciplina(Professor professor, Curso curso)
    {   
        this.professor = professor;
        this.curso = curso;
}

    public void lerDados(){
        System.out.println("***************************");
        System.out.println("DADOS DA DISCIPLINA");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome da disciplina:");
        this.nome = s.nextLine();
        System.out.println("Digite o codigo da disciplina:");
        this.codigo = s.nextInt();
        System.out.println("Digite a carga horaria:");
        this.carga_horaria = s.nextInt(); 
        System.out.println("***************************");
}
    public void mostraDados(){
        System.out.println("***************************");
        System.out.println("DADOS DA DISCIPLINA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereco: "+this.codigo);
        System.out.println("Telefone: "+this.carga_horaria);
        System.out.println("Nome do Curso: "+this.curso.getNome());
        System.out.println("Professor da Disciplina: "+this.professor.getNome());
        System.out.println("***************************");
    }
}