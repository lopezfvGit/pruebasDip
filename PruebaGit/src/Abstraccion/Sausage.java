package Abstraccion;

import java.util.Date;
public class Sausage {
    private double nutrition;
    private String colour;
    private Date expiration;

    public Sausage(double nutrition, String colour, Date expiration)
    {
        this.nutrition = nutrition;
        this.colour = colour;
        this.expiration = expiration;
    }

    public double getNutrition()
    {
    	return nutrition;}
    
    public void setNutritio(double nutrition) {this.nutrition = nutrition;}
    public String getColour() { return colour;}
    public void setColour(String colour) { this.colour= colour;}
    public Date getExpiration() { return expiration;}

}
