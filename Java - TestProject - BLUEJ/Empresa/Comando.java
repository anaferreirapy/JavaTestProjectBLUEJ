import java.util.Scanner;
import java.util.InputMismatchException;

public class Comando {
  
    private Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args) {
        Comando cmd = new Comando();
        cmd.executar();
    }
    
    public void executar () {
        //comandoRepeticao();
        comandoProtecao();
    }
    
    public void comandoDecisao() {
        //IF ELSE
        byte a = sc.nextByte();
        System.out.println("Informe um valor: ");
        if (a % 2 == 0){
          System.out.println("E um um numero par");   
        } else {
            System.out.println("Nao e um numero par");
        }
    
        // ESCOLHA;
        
        char b = 9;
        
        switch(b) {
            case 0: System.out.println("Soi 0"); break;
            case 1: System.out.println("Soi 1"); break;
            case 2: System.out.println("Soi 2"); break;
            case 3: System.out.println("Soi 3"); break;
            case 4: case 5: case 6: case 7: case 8: System.out.println("Sou de 4 a 8");
            default: break;
            
    }
}
public void comandoRepeticao() {
    //indeterminados...
    byte num = 10;
    while (num < 10) {
        num += 1;
    }
    System.out.println(num);
    
    byte num2 = 10;
    do {
        System.out.println("Informe um valor (-1 para sair): ");
        num2 = sc.nextByte();
    } while (num2 != -1);
    System.out.println(num2);
    
    //Determinada
    
    for (byte i = 0; i < 10; i += 1) {
        System.out.print(i + " ");
    }
    short [] x = {3, 6, 7, 4, 2};
    for (byte z = 0; z < x.length; z+=1) {
        System.out.print(x[z] + " ");
    }
    for (short t : x) {
        System.out.print (t+ " ");
    }
}

public void comandoProtecao() {
    
    System.out.println("Valor > 0:"); //externos
    int x = 0;
    int y = 0;
    try {
    x = sc.nextInt();
    y = 10;
   } catch (InputMismatchException e) {
    System.out.println("Informado um valor incorreto");
   }catch (ArithmeticException e) {
       System.out.println("Informado 0");
    } finally {
        
    }
   System.out.println(x + " " + y); 
   System.out.println("Terminei"); 
}
}
    
