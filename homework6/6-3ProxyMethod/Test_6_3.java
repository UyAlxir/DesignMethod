
public class Test_6_3 {
    public static void main(String[] args) {
        Queriable queryProxy = new QueryProxy();
        queryProxy.Query("Query");
        queryProxy.Query("Problem");
        queryProxy.Query("Query");
        queryProxy.Query("Question");
        queryProxy.Query("Question");
        queryProxy.Query("Problem");
        queryProxy.Query("Answer");
    }
}
