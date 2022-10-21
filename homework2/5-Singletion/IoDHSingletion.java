public class IoDHSingletion {
    //Initioalization on Demand Holder
    private static IoDHSingletion singletion  = null;
    private IoDHSingletion(){
        System.out.println("create singletion by "+this.getClass().getName());
    }
    private static class DemandHolder{
        private static IoDHSingletion singletion = new IoDHSingletion();
    }

    public static IoDHSingletion getInstance(){
        return DemandHolder.singletion;
    }

}
