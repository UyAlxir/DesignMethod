public class Member extends Entity{

    public Member(String name){
        super(name);
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + this.toString());
    }

    @Override
    public String toString() {
        return "[ " + this.name + " ]";
    }
}
