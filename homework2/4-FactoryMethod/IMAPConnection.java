public class IMAPConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("use "+this.getClass().getName());
    }
}
