public class Test_3_3 {
    public static void main(String[] args) {
        if(args.length!=1){
            Usage();
            System.exit(0);
        }
        try {
            Factory db = (Factory) Class.forName(args[0]).newInstance();
            Connection3_3 con = db.createConnetion();
            Statement sta = db.createStatement();
            con.execute();
            sta.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static void Usage(){
        System.out.println("Usage:");
        System.out.println("Java Test_3_3 oracle");
        System.out.println("Java Test_3_3 mysql");
    }

}
