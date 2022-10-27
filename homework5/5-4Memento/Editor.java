import java.util.ArrayList;
import java.util.List;

public class    Editor {
    private MyStack undoStack ;
    private MyStack redoStack;
    ArrayList<String> strings ;
    int size;
    public Editor(){
        this.strings = new ArrayList<String>();
        undoStack = new MyStack();
        redoStack = new MyStack();
        size = 0;
    }

    public Editor(List<String> list){
        this.strings = (ArrayList<String>) ((ArrayList<String>) list).clone();
        size = list.size();
    }

    public Memento createMomento(){
        Memento memento = new Memento();
        for(String s:strings){
            memento.addStr(s);
        }
        return memento;
    }

    public void addStr(String s){
        Memento memento =  createMomento();
        undoStack.push(memento);
        strings.add(s);
        System.out.print("add : ");
        print();
    }

    void cover(Memento memento){
        this.size = memento.getSize();
        this.strings.clear();
        this.strings.addAll(memento.getList());
    }

    public void undo(){
        if(undoStack.size==0)return ;
        Memento memento = createMomento();
        redoStack.push(memento);
        memento = undoStack.getTop();
        cover(memento);
        System.out.print("undo : ");
        print();
    }

    public void redo(){
        if(redoStack.size==0)return;
        Memento memento = createMomento();
        undoStack.push(memento);
        memento = redoStack.getTop();
        cover(memento);
        System.out.print("redo : ");
        print();
    }

    private void print(){
        System.out.print("[ ");
        for(String s:strings){
            System.out.print(" " + s + " ");
        }
        System.out.println(" ]");
    }
}
