public abstract class Visitor {
    public abstract void visit(MyCode myCode);
    public abstract void visit(MyClass myClass);
    public abstract void visit(MyAttribute myAttribute);
    public abstract void visit(MyMethod myMethod);
}
