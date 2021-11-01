package DependencyInversion;

public class MySQLConnection2
{
    private String database;

    public MySQLConnection2(String database)
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