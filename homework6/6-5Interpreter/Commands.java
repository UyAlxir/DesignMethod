public class Commands extends Node{
    private Node action;
    @Override
    public void parse(Context context) throws ParseException {
        action = new Action();
        action.parse(context);
    }

    @Override
    public String toString() {
        return "[ " + action + "] ";
    }
}
