public class Staticer1 implements Stasticer{
    @Override
    public void update(TextEditor textEditor) {
        System.out.println("\nthis is [ " + this.getClass().getName() + " ]");
        String text = textEditor.getText();
        text.replace("  "," ");
        int words = text.split(" ").length;
        int chars = text.replace(" ","").length();
        System.out.println("Currenct text has "+ words + " words and " + chars + " chars ");
        try{
            Thread.sleep(50);
        } catch (Exception e){
        }
    }
}
