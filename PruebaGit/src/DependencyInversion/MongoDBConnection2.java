package DependencyInversion;

public class MongoDBConnection2
{
    private String database;

    public MongoDBConnection2(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}