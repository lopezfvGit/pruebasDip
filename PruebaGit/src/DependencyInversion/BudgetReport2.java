package DependencyInversion;

public class BudgetReport2 implements Entity2
{
    private Database2 database;

    public BudgetReport2()
    {
        this.database = new MySQLDatabase2();
//        this.database = new MongoDB();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}