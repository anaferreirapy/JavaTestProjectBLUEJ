import java.util.Scanner;
public class AlunoPosGraduacao extends Aluno {
    String graduacao;
    String instituicao;
    int anoInicio;
    int anoConclusao;
    Curso curso;
    
    public AlunoPosGraduacao(Curso curso){
        this.curso = curso;
    }
    
    public void lerDados(){
        super.lerDados();
        System.out.println("***************************");
        System.out.println("Aluno Pos-Graduaçao:");
        Scanner s = new Scanner(System.in);
        System.out.println("Nome da Graduaçao que o aluno cursou:");
        this.graduacao = s.nextLine();
        System.out.println("Nome da Instituiçao de Graduaçao:");
        this.instituicao = s.nextLine();
        System.out.println("Ano de inicio:");
        this.anoInicio = s.nextInt();
        System.out.println("Ano de conclusao:");
        this.anoConclusao = s.nextInt();
        System.out.println("***************************");
    }
        public void mostraDados(){
        System.out.println("***************************");
        System.out.println("Aluno Pos-Graduaçao");
        System.out.println("Nome do Aluno:"+this.nome);
        System.out.println("Matricula do Aluno:"+this.matricula);
        System.out.println("CPF do Aluno:"+this.cpf);
        System.out.println("Curso do Aluno:"+this.curso.getNome());
        System.out.println("Nome da graduaçao que o aluno cursou: "+this.graduacao);
        System.out.println("Nome da Instituiçao de Graduaçao: "+this.instituicao);
        System.out.println("Ano de inicio da Graduaçao: "+this.anoInicio);
        System.out.println("Ano de conclusao da Graduaçao: "+this.anoConclusao);
        System.out.println("***************************");
    }
}
