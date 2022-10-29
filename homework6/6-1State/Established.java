public class Established implements State {

    private static Established established = new Established();

    private Established(){}

    @Override
    public void request() {
        System.out.println("Requsted : Current State is [ "+ this.getClass().getName() + " ]");
    }

    public static State getInstance(){
        return Established.established;
    }
}
