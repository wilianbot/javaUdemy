package javaudemy.enumeracaoEcomposicao.Composição;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javaudemy.enumeracaoEcomposicao.Composição.WorkerLevel;

public class Worker {
    // Atributos basicos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associação
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament(){
        return departament;
    }

    public void setDepartament(Departament departament){
        this.departament = departament;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }

    // Metodos

    // Metodo para adicionar contrato
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    // Metodo para remover contrato
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract cont : contracts) {
            cal.setTime(cont.getDate());
            int cont_year = cal.get(Calendar.YEAR);
            int cont_month = 1 + cal.get(Calendar.MONTH);
            if (year == cont_year && month == cont_month) {
                sum += cont.totalValue();
            }
        }
        return sum;
    }

    
}
