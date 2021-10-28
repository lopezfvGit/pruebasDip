package solid.liskov.figuras;

public class Aplicacion
{
    public static void main(String[] args) {
        Elipse elipse = new Elipse(10, 5);
        System.out.println(elipse.calcularArea());
        Figura circulo = new Circulo(7);
        System.out.println(circulo.calcularArea());

        Elipse circulo2 = new Circulo(7);
        System.out.println(circulo2.calcularArea());
        manejaElipses(elipse);
        manejaElipses(circulo2);
    }

    public static void manejaElipses(Elipse elipse) {
        elipse.setRadioMayor(10);
        elipse.setRadioMenor(5);
        System.out.println(elipse.getRadioMayor());
        System.out.println(elipse.getRadioMenor());
        System.out.println("En manejaElipses: " + elipse.calcularArea());
    }
}
