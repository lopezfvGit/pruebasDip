package Abstraccion;

import java.util.Date;

public class Fish implements Food
{
    private double nutrition;
    private String type;
    private Date expiration;

    public Fish(double nutrition, String type, Date expiration)
    {
        this.nutrition = nutrition;
        this.type = type;
        this.expiration = expiration;
    }

    public double getNutrition()
    {
        return nutrition;
    }

    public void setNutrition(double nutrition)
    {
        this.nutrition = nutrition;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }
}
