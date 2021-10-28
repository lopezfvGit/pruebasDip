package Abstraccion;

import java.util.Date;

public class TestCat2
{
    public static void main(String[] args) {
        Cat2 benito = new Cat2("Benito");
        Date expiration = new Date();
        Sausage2 sausage = new Sausage2(2.3, "rosa", expiration);
        Fish fish = new Fish(10.5,"gris", expiration);
        Carrot carrot = new Carrot(8.3,"naranja", expiration);       
        // En lugar de indicar que en la class Cat se alimenta con sausage, esto es declarar un método: ... eat(Sausage sausage)
        //     y luego adicionar que Cat también come carrot, esto es declarar un método: ...eat(Carrot carrot)
        //          y luego seguir adicionando en Cat cada alimento, esto es declarar un método: ...eat(Alimentox alimentox)
        //          y así subsecuentemente ...
        // mejor declarar una Interface que sea Food que dé el valor nutricional de cada alimento 
        //          y tener cada clase de Alimento (Sausage2, Carrot) indicando que se implementa con Food
        // Lo que lleva a que en Cat2, sólo declarar un método, el de la Interfaz Food
        // Y aquí, en la clase que tiene el Método Main (TestCat2)indicar los alimentos de cada instancia de Cat2 con los que se alimenta 

        System.out.println("Benito no ha comido: " + benito.getEnergy());
        benito.eat(sausage);
        benito.eat(fish);
        benito.eat(carrot);
        System.out.println("Benito ya comio (es un goloso): " + benito.getEnergy());
    }
}
