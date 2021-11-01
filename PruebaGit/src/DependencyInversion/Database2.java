package DependencyInversion;

public interface Database2
{
    void connect(String database);
    void insert(Entity2 entity);
    void update(Entity2 entity);
    void delete(Entity2 entity);
    void disconnect();
}