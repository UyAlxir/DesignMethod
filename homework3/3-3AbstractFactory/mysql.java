public class mysql extends Factory{
    @Override
    public Connection3_3 createConnetion() {
        return new mysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new mysqlStatement();
    }
}
