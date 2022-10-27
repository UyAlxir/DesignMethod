public class HotelsSubSystem implements SubSystem{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void recieveInfo(String info) {
        System.out.println(this.getClass().getName() + " receive info from mediator : [ " + info + " ]");
    }

    @Override
    public void sentInfo(String info) {
        System.out.println(getClass().getName() + " sent info to mediator : [ "+ info + " ]");
        this.mediator.recieveInfo(info,this);
    }
}
