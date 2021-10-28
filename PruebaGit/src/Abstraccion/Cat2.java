package Abstraccion;

public class Cat2
{
    private String name;
    private double energy;

    public Cat2(String name)
    {
        this.name = name;
    }

    // En lugar de indicar que en la class Cat se alimenta con sausage, esto es declarar un método: ... eat(Sausage sausage)
    //     y luego adicionar que Cat también come carrot, esto es declarar un método: ...eat(Carrot carrot)
    //          y luego seguir adicionando en Cat cada alimento, esto es declarar un método: ...eat(Alimentox alimentox)
    //          y así subsecuentemente ...
    // mejor declarar una Interface que sea Food que dé el valor nutricional de cada alimento 
    //          y tener cada clase de Alimento (Sausage2, Carrot) indicando que se implementa con Food
    // Y en la clase que tiene el Método Main (TestCat2)indicar los alimentos de cada instancia de Cat2 con los que se alimenta 
    // Y aquí en Cat2, sólo declarar un método, el de la Interfaz Food
    public void eat(Food food) {
        energy += food.getNutrition();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getEnergy()
    {
        return energy;
    }

    public void setEnergy(double energy)
    {
        this.energy = energy;
    }
}
