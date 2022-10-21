import java.util.ArrayList;
import java.util.List;

public class Test_3_2 {

    static List<String> builders = new ArrayList<String>();

    public static void main(String[] args) {
        Builders();
        if(args.length!=1){
            Usage();
            System.exit(0);
        }
        Director director=null;
        for (String s:builders){
            if (s.equals(args[0])){
                try {
                    Builder builder = (Builder) Class.forName(s).newInstance();
                    director=new Director(builder);
                    director.construct();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }
        Usage();
    }

    static void Usage(){
        System.out.println("usage:");
        for (String s:builders){
            System.out.println("Java Test_3_2 "+s);
        }

    }

    static void Builders(){
        builders.add(Truck.class.getName());
        builders.add(SportCar.class.getName());
        builders.add(FormulaRacing.class.getName());
        builders.add(OffRoadRacing.class.getName());
    }
}
