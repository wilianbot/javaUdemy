package javaudemy.HerancaEPolimorfismo.ExercicioFixacao002;

public class Company extends Tax {
    private Integer numberEmployees;
    private Double incomePago;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double imposto() {
        if (numberEmployees > 10) {
            incomePago = anualIncome * 14 / 100;
        } else {
            incomePago = anualIncome * 16 / 100;
        }
        return incomePago;
    }
}
