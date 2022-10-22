public abstract class Entity {
    protected String name;

    public Entity(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    };
    public abstract int getSize();

    public Entity add(Entity entity) throws MemberTreatmentException{
        throw new MemberTreatmentException();
    }
    public void  printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    public abstract String toString();
}
