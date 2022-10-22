import java.util.Iterator;

public class RowsVisitor extends Visitor{
    @Override
    public void visit(MyCode myCode) {
        int cnt = 0;
        Iterator it = myCode.iterator();
        while(it.hasNext()){
            Codes codes =(Codes) it.next();
            try{
                cnt += codes.getRows();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(myCode.toString() + ": has "+ cnt + " line(s)");
    }

    @Override
    public void visit(MyClass myClass) {
        int cnt = 0;
        try {
            cnt = myClass.getRows();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(myClass.toString() + ": has "+cnt + " line(s)");
    }

    @Override
    public void visit(MyAttribute myAttribute) {
        System.out.println(myAttribute.toString() + ": has only 1 line");
    }

    @Override
    public void visit(MyMethod myMethod) {
        int cnt = 0;
        try {
            cnt = myMethod.getRows();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(myMethod.toString() + ": has "+cnt + " line(s)");
    }
}
