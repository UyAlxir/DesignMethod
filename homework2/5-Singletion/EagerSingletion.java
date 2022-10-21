public class EagerSingletion {
    private static final EagerSingletion singletion = new EagerSingletion();
    private EagerSingletion(){
        System.out.println("create singletion by "+this.getClass().getName());
    }
    public static  EagerSingletion getInstance(){
        return singletion;
    }
}
