package Composicion;

public abstract class Transport
{
    public void deliver(String destination, String cargo) {
        this.navigate();
        this.move();
        System.out.println(cargo + " has been delivered at " + destination);
    }

    public abstract void navigate();
    public abstract void move();
}
