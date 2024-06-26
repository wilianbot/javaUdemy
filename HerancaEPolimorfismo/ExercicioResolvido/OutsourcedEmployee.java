package javaudemy.HerancaEPolimorfismo.ExercicioResolvido;

public class OutsourcedEmployee extends Employee {
    private Double additionCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionCharge) {
        super(name, hours, valuePerHour);
        this.additionCharge = additionCharge;
    }

    public Double getAdditionCharge() {
        return additionCharge;
    }

    public void setAdditionCharge(Double additionCharge) {
        this.additionCharge = additionCharge;
    }

    // Metodos

    @Override
    public Double payment(){
        return super.payment() + additionCharge * 1.1;
    }    
}
