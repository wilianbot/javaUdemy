package javaudemy.HerancaEPolimorfismo.Abtratos;

public class Circle extends Shape{
    private Double radius;

    public Circle(){
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
