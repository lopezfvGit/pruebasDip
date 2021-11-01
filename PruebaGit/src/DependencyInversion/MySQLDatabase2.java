package DependencyInversion;

public class MySQLDatabase2 implements Database2
{
    MySQLConnection2 connection;

    public void connect(String database) {
        connection = new MySQLConnection2(database);
    }

    public void insert(Entity2 entity) {
        System.out.println("Inserting " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void update(Entity2 entity) {
        System.out.println("Updating " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void delete(Entity2 entity){
        System.out.println("Deleting " + entity + " in MySQL using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}