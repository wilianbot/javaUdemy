package javaudemy.ConstrutoresSobrecargaEtc.Encapsulamento;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){
    }

    public Product(String name, double price, int quantity) { // Construtor 
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // Construtor Sobrecarregado
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueStock(){

        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;  // this uma auto referencia para o objeto - especificando que quero acessar o atribudo da classe
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueStock());
    }
}
