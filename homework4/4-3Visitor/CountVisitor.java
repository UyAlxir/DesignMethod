import java.util.Iterator;

public class CountVisitor extends Visitor{
    private String curPrefix = "";
    @Override
    public void visit(MyCode myCode) {
        Iterator it = myCode.iterator();
        int cnt = 0;
        while(it.hasNext()){
            cnt++;
            it.next();
        }
        System.out.println(myCode.toString() + ": has " + cnt + " Class(es)");
    }

    @Override
    public void visit(MyClass myClass) {
        Iterator it = myClass.iterator();
        int cntMethod = 0 , cntAttribute = 0;
        while(it.hasNext()){
            Codes codes =(Codes) it.next();
            if ( ((String)codes.getClass().getName()).equals("MyMethod")) cntMethod++;
            else cntAttribute++;
        }
        System.out.println(myClass.toString() + "has " + cntMethod + " Method(s)");
        System.out.println(myClass.toString() + "has " + cntAttribute + " Attribute(s)");
    }

    @Override
    public void visit(MyAttribute myAttribute) {
        System.out.println(myAttribute.toString() + "has nothing to be count ");
    }

    @Override
    public void visit(MyMethod myMethod) {
        System.out.println(myMethod.toString() + "has nothing to be count ");
    }

}
