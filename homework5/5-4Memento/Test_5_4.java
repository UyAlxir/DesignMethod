public class Test_5_4 {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addStr("hello");
        editor.addStr("nihao");
        editor.undo();
        editor.addStr("yaxshimu");
        editor.redo();
        editor.undo();
        editor.undo();
        editor.undo();
    }
}
