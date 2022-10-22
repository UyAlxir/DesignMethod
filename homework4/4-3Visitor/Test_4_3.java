import java.util.concurrent.Callable;

public class Test_4_3 {
    public static void main(String[] args) {
        Codes codeRoot = new MyCode("root");
        Codes class1 = new MyClass("class1",10);
        Codes class2 = new MyClass("class2",8);
        Codes method1 = new MyMethod("method1",4);
        Codes method2 = new MyMethod("method2",5);
        Codes method3 = new MyMethod("method3",8);
        Codes attribute1 = new MyAttribute("attribute1");
        Codes attribute2 = new MyAttribute("attribute2");
        Codes attribute3 = new MyAttribute("attribute3");
        Codes attribute4 = new MyAttribute("attribute4");
        try{
            codeRoot.add(class1);
            codeRoot.add(class2);
            class1.add(method1);
            class1.add(method3);
            class2.add(method2);
            class1.add(attribute4);
            class2.add(attribute1);
            class2.add(attribute2);
            class2.add(attribute3);
        } catch (Exception e){
            e.printStackTrace();
        }
        codeRoot.accept(new RowsVisitor());
        codeRoot.accept(new CountVisitor());
        class1.accept(new CheckNameVisitor());
        class1.accept(new CountVisitor());
        class2.accept(new CountVisitor());
        attribute1.accept(new CheckNameVisitor());
        method2.accept(new CheckNameVisitor());
        method1.accept(new RowsVisitor());
        attribute4.accept(new RowsVisitor());
    }
}
