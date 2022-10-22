import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group extends Entity{

    private List<Entity> entityList = new ArrayList<Entity>();

    public Group(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int sz = 0;
        Iterator it = entityList.iterator();
        while(it.hasNext()){
            sz ++;
            it.next();
        }
        return sz;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + this.toString());
        Iterator it = entityList.iterator();
        while(it.hasNext()){
            ((Entity)it.next()).printList(prefix+"---  ");
        }
    }

    public Entity add(Entity entity){
        entityList.add(entity);
        return this;
    }

    @Override
    public String toString() {
        return "{ " + this.name + " , " + this.getSize() + " } ";
    }
}
