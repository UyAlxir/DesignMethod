public class Where extends Node{
    private String src;
    private String dst;
    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken()==null){
            throw new ParseException("Command not complete");
        }
        if(!context.currentToken().equals("FROM")){
            throw new ParseException("Missign 'FROM'");
        }
        context.nextToken();
        if(context.currentToken()==null){
            throw new ParseException("Command not complete");
        }
        src = context.currentToken();
        context.nextToken();
        if(!context.currentToken().equals("TO")){
            throw new ParseException("Missign 'TO'");
        }
        context.nextToken();
        if(context.currentToken()==null){
            throw new ParseException("Command not complete");
        }
        dst = context.currentToken();
        context.nextToken();
        if(context.currentToken()!=null){
            throw new ParseException("command is wrong");
        }
    }

    @Override
    public String toString() {
        return "[ FROM [ " + src + " ] TO [ " + dst + " ] ] ";
    }
}
