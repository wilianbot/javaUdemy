package javaudemy.HerancaEPolimorfismo.ExercicioFixacao002;

public abstract class Tax {
    private String name;
    protected Double anualIncome;

    public Tax(){
    }

    public Tax(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return anualIncome;
    }

    public void setRendaAnual(Double anualIncome) {
        this.anualIncome = anualIncome;
    }


    public abstract double imposto(); 
}
