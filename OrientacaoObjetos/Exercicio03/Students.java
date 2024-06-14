package javaudemy.OrientacaoObjetos.Exercicio03;

public class Students {
    public double notas; 
    public double missingNotas;

    public void passOrFailed(){
        if (notas > 60) {
            System.out.println("FINAL GRADE = " + notas);
            System.out.println("PASS");
        }else {
            System.out.println("FINAL GRADE = " + notas);
            System.out.println("FAILED");
            missingNotas = 60 - notas;
            System.out.println("MISSING " + missingNotas + " POINTS");    
        }
    }
}
