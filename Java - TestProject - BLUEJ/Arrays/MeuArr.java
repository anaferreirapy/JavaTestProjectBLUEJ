public class MeuArr {
    
    private int x1, x2, x3;
    private int [] x;
    
    public static void main(String [] args) {
        new MeuArr().executar();
    }
    public void executar() {
        
        x = new int[]{1, 5, 4};
        x1 = 1;
        x2 = 5;
        x3 = 4;
        
        for (byte i = 0; i < x.length; i++) {
            x[i] += 4;
        }
        
        
        
        x1 += 4;
        x2 += 4;
        x3 += 4;
        
        for(int z: x) {
            System.out.println(z);
        }
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}