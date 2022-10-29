import java.util.Iterator;
import java.util.Stack;

public class Switchs implements Command{

    private Stack<Command> switches;

    public Switchs(){
        this.switches = new Stack<>();
    }

    @Override
    public void excute() {
        Iterator<Command> it = switches.iterator();
        while(it.hasNext()){
            it.next().excute();
        }
    }

    public void addSwitch(Command switch_){
        if(switch_ != this){
            switches.push(switch_);
        }
    }

    public void popSwitch(){
        if(!switches.empty())switches.pop();
    }

    public void clearSwitchs(){
        switches.clear();
    }

}
