package Abstraccion;

public class Cat {
	    private String name;
	    private double energy;

	    public Cat(String name)
	    {
	        this.name = name;
	    }

	    public void eat(Sausage sausage) {
	        energy += sausage.getNutrition();
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

