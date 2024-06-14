package javaudemy.OrientacaoObjetos.Exercicio01;

public class Rectangle {
    public double width;
    public double height;
    
    public double area(){

        return width * height;
    }

    public double perimeter(){

        return (width + height) * 2;
    }

    public double diagonal(){

        return Math.sqrt(width * width + height *  height);
    }
    
    public String toString(){

        return "AREA: " 
        + String.format("%.2f", area())
        + " PERIMETER: " 
        + String.format("%.2f", perimeter())
        + " DIAGONAL: " 
        + String.format("%.2f", diagonal());              
    }
}
