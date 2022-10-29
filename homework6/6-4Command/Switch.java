public class Switch implements Command{
    private String _switch;
    private Room room;
    public Switch(String _switch){
        this._switch = _switch;
        this.room = null;
    }

    @Override
    public void excute() {
        System.out.println(this.room.toString() + " has been turned " + (this.room
                .Switch()==1?"on":"off") +  " by " +  this.toString()  );
    }

    public void setRoom(Room room){
        System.out.println("Switch [ " + this._switch + " ] controlling " + room.toString());
        this.room = room;
    }

    public String toString(){
        return "Switch [ " + this._switch + " ]";
    }
}
