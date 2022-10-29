public class Action extends Node{
    private Node Objects;
    private String action;
    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken()==null){
            throw new ParseException("Missing 'Action' ");
        } else if(context.currentToken().equals("COPY")|| context.currentToken().equals("MOVE")){
            action = context.currentToken();
            Objects = new Objects();
            context.nextToken();
            Objects.parse(context);
        } else {
            throw new ParseException(context.currentToken() + " Action if undefiend");
        }
    }

    public String toString(){
        return "[ " + action + " " + Objects + "] ";
    }
}
