public class Objects extends Node{
    private String object = null ;
    private String Type;
    private Node where;
    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken()==null){
            throw new ParseException("Missing DataBase Type");
        }
        else if(context.currentToken().equals("VIEW")||context.currentToken().equals("TABLE")){
            Type = context.currentToken();
            context.nextToken();
            if(!context.currentToken().equals("FROM")){
              object = context.currentToken();
              context.skipToken(object);
            }
            where = new Where();
            where.parse(context);
        } else {
            throw new ParseException(context.currentToken() + " Database Type is undefined ");
        }
    }

    @Override
    public String toString() {
        return "[ " + (object==null?("All " + Type + "s "):(Type + " " + object + " ")) + where + "] ";
     }
}
