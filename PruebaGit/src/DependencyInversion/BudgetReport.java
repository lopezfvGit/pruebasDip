package DependencyInversion;

public class BudgetReport implements Entity
{
    private MySQLDatabase database;

    public BudgetReport()
    {
        this.database = new MySQLDatabase();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}
