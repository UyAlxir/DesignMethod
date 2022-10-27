public class MyTextEditor extends TextEditor{
    private String text;
    @Override
    public String getText() {
        return text;
    }

    @Override
    public void execute() {
        text = "This is just a test text , u konw that I am just only text tester";
        this.radio();
    }
}
