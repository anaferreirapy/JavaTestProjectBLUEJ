import java.util.ArrayList;
public class Pessoa
{
    private String nome, end, cid, bairro,est,email;
    private String  cpf, rg, fone;
    private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
    Pessoa (String nome, String cpf, String rg){
        if (cpf.matches("[0-9]+") && cpf.length()==11){
    System.out.println("CPF valido");
}
        else{
    System.out.println("CPF valido");
}
        if (rg.matches("[0-9]+") && rg.length()==10){
    System.out.println("RG valido");
}
        else{
    System.out.println("RG valido");
}
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }
    public void VincularConta(Conta conta)
   {
        listaDeContas.add(conta);
   }
   
   public  void setEnd(String end)
   {
        this.end = end;
   }
   public  void setCid(String cid )
   {
       this.cid = cid;
   }
    
   public  void setBairro(String bairro)
   {
       this.bairro = bairro;
   }
   public  void setEst(String est)
   {
       this.est = est;
   }
   public  void setEmail(String email)
   {
       this.email = email;
   }
   public  void setFone(String fone)
   {
       this.fone = fone;
   }
   
 
   public String  getNome ()
   {
       return nome;
   }
   
   public String  getEnd ()
   {
       return end;
   }
   
   public String getCid()
   {
       return cid;
   }
   
   public String getBairro()
   {
       return bairro;
   }
   
   public String getEst()
   {
       return est;
   }
   public String getEmail()
   {
       return email;
   }
   
   public String getCpf()
   {
       return cpf;
   }
   
   public String getRg()
   {
       return rg;
   }
   
   public String getFone()
   {
       return fone;
   }
}