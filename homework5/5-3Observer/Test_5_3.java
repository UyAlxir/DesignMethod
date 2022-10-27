public class Test_5_3 {
    public static void main(String[] args) {
        Stasticer stasticer1 = new Staticer1();
        Stasticer stasticer2 = new Staticer2();
        Stasticer stasticer3 = new Staticer3();
        TextEditor textEditor = new MyTextEditor();
        textEditor.add(stasticer1);
        textEditor.add(stasticer2);
        textEditor.add(stasticer3);
        textEditor.execute();
    }
}
