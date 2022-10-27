import java.util.*;

public class Staticer2 implements Stasticer{
    @Override
    public void update(TextEditor textEditor) {
        System.out.println("\nthis is [ " + this.getClass().getName() + " ]");
        String text = textEditor.getText();
        text = text.replace(",","");
        text = text.replace("  "," ");
        Set<String> set = new TreeSet<String>();
        for(String s:text.split(" ")){
            set.add(s);
        }
        for (String it:set){
            System.out.println(it);
        }
        try{
            Thread.sleep(50);
        } catch (Exception e){
        }
    }
}
