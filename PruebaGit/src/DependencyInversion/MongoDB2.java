package DependencyInversion;

public class MongoDB2 implements Database2
{
    MongoDBConnection2 connection;

    public void connect(String database) {
        connection = new MongoDBConnection2(database);
    }

    public void insert(Entity2 entity) {
        System.out.println("Inserting " + entity + " in MongoDB using " + connection.getDatabase());
    }

    public void update(Entity2 entity) {
        System.out.println("Updating " + entity + " in MongoDB using " + connection.getDatabase());
    }

    public void delete(Entity2 entity){
        System.out.println("Deleting " + entity + " in MongoDB using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}