import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Staticer3 implements Stasticer{
    @Override
    public void update(TextEditor textEditor) {
        System.out.println("\nthis is [ " + this.getClass().getName() + " ]");
        String text = textEditor.getText();
        text = text.replace(",","");
        text = text.replace("  "," ");
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for(String s:text.split(" ")){
            int cur = 1;
            if(map.containsKey(s)){
                cur += map.get(s);
            }
            map.put(s,cur);
        }
        Set<String> list = map.keySet();
        for(String s:list){
            System.out.println(s + " : " + map.get(s));
        }
        try{
            Thread.sleep(50);
        } catch (Exception e){
        }
    }
}
