public class CheckNameVisitor extends Visitor{
    @Override
    public void visit(MyCode myCode) {
        System.out.println(myCode.toString() + ": Name is good");
    }

    @Override
    public void visit(MyClass myClass) {
        System.out.println(myClass.toString() + ": Name is good");
    }

    @Override
    public void visit(MyAttribute myAttribute) {
        System.out.println(myAttribute.toString() + ": Name is good");
    }

    @Override
    public void visit(MyMethod myMethod) {
        System.out.println(myMethod.toString() + ": Name is good");
    }
}
