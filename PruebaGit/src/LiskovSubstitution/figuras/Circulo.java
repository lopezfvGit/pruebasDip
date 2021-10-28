package solid.liskov.figuras;

public class Circulo extends Elipse
{
    public Circulo(double radio) {
        super(radio, radio);
    }

    @Override
    public double calcularArea()
    {
        return Math.PI * this.radioMayor * this.radioMayor;
    }
}
