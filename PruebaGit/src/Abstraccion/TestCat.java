package Abstraccion;



import java.util.Date;
public class TestCat{
	public static void main(String[] args){
		Cat benito = new Cat("Benito");
		Date expiration = new Date();
		                         // nutrition, colour, expiration
		Sausage salchicha = new Sausage(2.3, "rosa", expiration);

		System.out.println("Benito no ha comido: " + benito.getEnergy());
		benito.eat(salchicha);
		System.out.println("Benito ya comio: " + benito.getEnergy());
	}
}
