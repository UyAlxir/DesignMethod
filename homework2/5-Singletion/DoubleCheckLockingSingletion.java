public class DoubleCheckLockingSingletion {
    private static DoubleCheckLockingSingletion singletion = null;
    private DoubleCheckLockingSingletion(){
        System.out.println("create singletion by "+this.getClass().getName());
    }
    public static DoubleCheckLockingSingletion getInstance(){
        if(singletion==null){
            synchronized (DoubleCheckLockingSingletion.class){
                if(singletion==null){
                    singletion = new DoubleCheckLockingSingletion();
                }
            }
        }
        return singletion;
    }
}
