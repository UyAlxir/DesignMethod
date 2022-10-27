import java.util.ArrayList;

public abstract class TextEditor {
    private ArrayList<Stasticer> stasticerArrayList;
    public TextEditor(){
        stasticerArrayList = new ArrayList<Stasticer>();
    }
    public void add(Stasticer stasticer){
        stasticerArrayList.add(stasticer);
    }
    public void radio(){
        for(Stasticer stasticer:stasticerArrayList){
            stasticer.update(this);
        }
    }
    public abstract String getText();
    public abstract void execute();
}
