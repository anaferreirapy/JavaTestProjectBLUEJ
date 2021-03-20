class Funcionario {
    private int matricula;
    private String nome;
    
    public Funcionario(int matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;
    }
    
    public int hashcode() {
        return matricula;
    }
    public String toString() {
        return nome;
    }
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}

public class Empresa {
    public void contratar() {
        Funcionario fernando = new Funcionario(1, "Fernando");
        Funcionario maria = new Funcionario(2, "Maria");
        System.out.println(fernando);
        System.out.println(maria);
        if (fernando.equals(maria)) {
            System.out.println("Mesmo funcionario");
        } else {
            System.out.println("Nao e o mesmo funcionario");
        }
    }
    
    public static void main(String [] args) {
        Empresa emp = new Empresa();
        emp.contratar();
    }
    
}