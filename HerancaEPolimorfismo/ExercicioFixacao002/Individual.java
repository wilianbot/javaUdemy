package javaudemy.HerancaEPolimorfismo.ExercicioFixacao002;

public class Individual extends Tax{
    private Double healthExpenditures;
    private double incomePago;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double imposto() {
        if (anualIncome < 20000) {
            incomePago = (anualIncome * 15 / 100) - (healthExpenditures * 50 / 100);
        } else if (anualIncome > 20000){
            incomePago = (anualIncome * 25 / 100) - (healthExpenditures * 50 / 100);
        } else {
            incomePago = (anualIncome * 50 / 100) - (healthExpenditures * 50 / 100);
        }
        return incomePago;
    }


}
