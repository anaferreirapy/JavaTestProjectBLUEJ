public class Conta{
    private Pessoa titular;
    private String numero, dig;
    private float saldo;
    Conta(Pessoa titular, String numero, String dig)
    {
        this.titular = titular;
        this.numero = numero;
        this.dig = dig;
        saldo=0;
        titular.VincularConta(this);
    }
    void creditar (float valor){
        this.saldo += valor;
}
    boolean debitar (float valor){
        if (this.saldo>=valor){
            this.saldo-=valor;
            return(true);
        }
        else{
        return false;
}
}
}