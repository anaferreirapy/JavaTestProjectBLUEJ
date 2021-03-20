public class FuncionarioTeste {
public void main(String[] args) {
     testaFuncionario();
}
public void testaFuncionario(){
Funcionario meuFuncionario = new Funcionario("ana","qualidade", 100.00,"0000000","20/20/2000",true);
/*meuFuncionario.setNome("Ana Paula");
meuFuncionario.setDepartamento("Qualidade");
meuFuncionario.setSalario(100.00);
meuFuncionario.setRg("1112221177");
meuFuncionario.setDataEntrada("01/01/2021");
meuFuncionario.setEstaNaEpresa(true);
*/ 
meuFuncionario.mostra();
}
}