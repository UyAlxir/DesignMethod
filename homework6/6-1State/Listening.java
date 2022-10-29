public class Listening implements State {

    private static Listening listening = new Listening();

    private Listening(){}

    @Override
    public void request() {
        System.out.println("Requsted : Current State is [ "+ this.getClass().getName() + " ]");
    }

    public static State getInstance(){
        return Listening.listening;
    }
}
