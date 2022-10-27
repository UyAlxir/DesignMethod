import java.util.ArrayList;
import java.util.List;

public class    Memento {
    int size;
    ArrayList<String> list;
    public int getSize(){
        return this.size;
    }
    Memento(){
        size=0;
        list = new ArrayList<String>();
    }

    void addStr(String str){
        list.add(str);
        size++;
    }

    List<String> getList(){
        return (List)list.clone();
    }
}
