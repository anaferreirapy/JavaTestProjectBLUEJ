import java.util.Scanner;
public class Curso{
    int codigo;
    int duracao;
    String nome;
    String nomePos;
    
    public String getNome(){
        return this.nome;
    }
    public String getNomePos(){
        return this.nomePos;
    }
    public Curso(){
    }
    
    public void lerDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO CURSO");
        Scanner s = new Scanner(System.in);
        System.out.println("Nome do curso:");
        this.nome = s.nextLine();
        System.out.println("Codigo do curso:");
        this.codigo = s.nextInt();
        System.out.println("Duracao do curso (em meses):");
        this.duracao = s.nextInt();
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("Pos-graduacao");
        System.out.println("Nome da pos-graduacao:");
        this.nomePos = s.nextLine();
        System.out.println("***************************");
    }
    public void mostraDados(){
        System.out.println("***************************");
        System.out.println("DADOS DO CURSO");
        System.out.println("Nome do curso: "+this.nome);
        System.out.println("Codigo do curso: "+this.codigo);
        System.out.println("Duracao do curso: "+this.duracao);
        System.out.println("***************************");
    }
}