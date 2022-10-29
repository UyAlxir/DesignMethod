public class Test_6_4 {
    public static void main(String[] args) {
        Switch s1 = new Switch("s1");
        Room r1 = new Room("room1");
        s1.setRoom(r1);
        s1.excute();
        s1.excute();
        s1.excute();
        Switch s2 = new Switch("s2"),s3 = new Switch("s3"),
                s4 = new Switch("s4"),s5 = new Switch("r5");
        Room r2=new Room("room2"),r3 = new Room("room3"),r4 = new Room("room4"),
                r5 = new Room("room5"),r6 = new Room("room6");
        s2.setRoom(r2);s3.setRoom(r3);s4.setRoom(r4);s5.setRoom(r5);
        s2.excute();s4.excute();
        Switchs switchs = new Switchs();
        switchs.addSwitch(s1);switchs.addSwitch(s2);switchs.addSwitch(s3);
        switchs.addSwitch(s4);switchs.addSwitch(s5);
        switchs.excute();
        s5.setRoom(r6);
        s5.excute();s5.excute();s5.excute();
    }
}
