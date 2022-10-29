public class Closed implements State {

    private static Closed closed = new Closed();

    private Closed(){}

    @Override
    public void request() {
        System.out.println("Requsted : Current State is [ "+ this.getClass().getName() + " ]");
    }

    public static State getInstance(){
        return Closed.closed;
    }
}
