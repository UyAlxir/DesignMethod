public class Room {
    private String room;
    private int state;
    public Room(String room){
        this.room = room;
        this.state = 0;
    }

    public int Switch(){
        state^=1;
        return state;
    }

    public String toString(){
        return "Room [ " + this.room + " ]";
    }

}
