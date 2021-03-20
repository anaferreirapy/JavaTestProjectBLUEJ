abstract interface Animal {
     void comer();
abstract class Pet implements Animal {
    public abstract void emitirSom();
    public boolean isDomesticado() {
        return true;
}
}

class Cachorro extends Pet {
    public void emitirSom() {
        System.out.println("AUAUAU");
}
    public void comer() {
        System.out.println("Raçao para cachorros");
}
}
class Gato extends Pet {
    public void emitirSom() {
        System.out.println("Miauuu");
}
    public void comer() {
        System.out.println("Raçao para gatos");
}
}
public class PetStore {
    
    public void executar() {
        Cachorro lulu = new Cachorro();
        Gato mingau = new Gato();
        lulu.comer();
        mingau.comer();
    }
    
    public static void main(String [] args) {
        new PetStore().executar();
    }
}
}
    