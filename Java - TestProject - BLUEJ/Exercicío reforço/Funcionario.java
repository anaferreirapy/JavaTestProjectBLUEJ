public class Funcionario {
    private String nome;
    private String departamento;
    private Double salario;
    private String rg;
    private String dataEntrada;
    private boolean estaNaEmpresa;
    public Funcionario(String nome, String departamento, Double salario, String rg, String dataEntrada, boolean estaNaEmpresa) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.dataEntrada = dataEntrada;
        this.estaNaEmpresa = estaNaEmpresa;
    }
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Rg: " + this.rg);
        System.out.println("Data de Entrada: " + this.dataEntrada);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return rg;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
	this.estaNaEmpresa = estaNaEmpresa;
}
    public boolean getEstaNaEmpresa() {
    return estaNaEmpresa;
}

    public void bonifica(double aumento){
        this.salario += aumento;
    }
    
    public void demite(){
        if(estaNaEmpresa == true){
        System.out.println("Esta na empresa!");
    } else {
        System.out.println("Demitido!");
    }
    }
}