package javaudemy.OrientacaoObjetos.Exercicio02;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;


    public double netSalary(){

        return grossSalary - tax + percentage;
    }

    public void increaseSalary(double percentage){

        this.percentage = grossSalary * percentage / 100;
    }

    public String toString(){
        return "Employee: " 
        + name 
        + ", $ " 
        + String.format("%.2f", netSalary());
    }
}
