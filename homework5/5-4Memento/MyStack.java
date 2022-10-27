import java.util.ArrayList;

public class    MyStack {
    int size;
    ArrayList<Memento> arrayList ;
    public MyStack(){
        size=0;
        this.arrayList = new ArrayList<Memento>();
    }

    Memento getTop(){
        if(size==0)return null;
        Memento memento = arrayList.get(size-1);
        arrayList.remove(size-1);
        size--;
        return memento;
    }

    void push(Memento memento){
        size++;
        arrayList.add(memento);
    }
}
