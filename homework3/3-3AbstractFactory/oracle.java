public class oracle extends Factory{
    @Override
    public Connection3_3 createConnetion() {
        return new oracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new oracleStatement();
    }
}
