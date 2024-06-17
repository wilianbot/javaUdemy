package javaudemy.ComportamentoMemoria.forEach;

public class Program {
    
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        
        // Padrão
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        // forEach
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
