package javaudemy.OrientacaoObjetos.Problema01;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
