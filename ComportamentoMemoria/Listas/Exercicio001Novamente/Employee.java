package javaudemy.ComportamentoMemoria.Listas.Exercicio001Novamente;

public class Employee {
   private Integer id;
   private String name;
   private Double salary;

   // Construtores

   public Employee(){
   }

   public Employee(Integer id, String name, Double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
   }

   // Metodos de acesso

   public Integer getId(){
    return id;
   }

   public void setId(Integer id){
    this.id = id;
   }

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }

   public Double getSalary(){
    return salary;
   }

   public void setSalary(Double salary){
    this.salary = salary;
   }

   // Metodo

   public void salaryIncrease(Double percetage){
    this.salary += salary * percetage / 100;
   }

   // toString

   public String toString(){
    return id + ", " + name + ", " + String.format("%.2f", salary);
   }
}
