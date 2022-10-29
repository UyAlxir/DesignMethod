import java.util.HashMap;

public class QueryProxy implements Queriable{
    private HashMap<String,String> proxy;
    public QueryProxy(){
        proxy = new HashMap<>();
    }
    @Override
    public String Query(String query) {
        String re = null;
        if(proxy.containsKey(query)){
            re =proxy.get(query);
        } else {
            re = new Query().Query(query);
            proxy.put(query,re);
        }
        System.out.println( "[ proxy Answered " + re + " ]");
        return re;
    }
}
