public class Main{
public static void main(String[] args){
Pessoa n = new Pessoa("Joao","1112223333","11122233344");
n.setEnd("Rua Zero");
n.setCid("Porto Alegre");
n.setBairro("Sta Maria Goretti");
n.setEst("RS");
n.setEmail("asdjadjaiso@gmail.com");
n.setFone("555555555");
Conta c = new Conta(n, "666", "1");
c.creditar(10);
c.debitar(80);
}
}