public class POP3Connection implements Connection {
    @Override
    public void connect() {
        System.out.println("use "+this.getClass().getName());
    }
}
