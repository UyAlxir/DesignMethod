public class Test_4_1 {
    public static void main(String[] args) {
        System.out.println();
        Group groupA = new Group("Group A");
        Group groupB = new Group("Group B");
        Member memberA = new Member("Member A");
        Member memberB = new Member("Member B");
        groupA.add(memberA);
        groupA.add(memberB);
        groupB.add(memberB);
        groupB.add(groupA);
        Group home = new Group("Home");
        home.add(groupB);
        Group groupC = new Group("Group C");
        Group groupD = new Group("Gropu D");
        Group groupE = new Group("Group E");
        Member memberE = new Member("Member E");
        groupE.add(memberE);
        home.add(groupD);
        home.add(groupE);
        home.add(groupC);
        home.printList();
    }
}
