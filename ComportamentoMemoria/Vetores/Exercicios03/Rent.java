package javaudemy.ComportamentoMemoria.Vetores.Exercicios03;

public class Rent {
    private String name;
    private String email;

    // Construtor

    public Rent() {
    }

    public Rent(String name, String email){
        this.name = name;
        this.email = email;
    } 

    // Metodos de acesso

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return name + ", " + email;
    }
    
}
