public class Test_4_2 {
    public static void main(String[] args) {
        Display d1 = new Table("This Is A Table");
        d1.showTable();

        Display d2 = new Head(d1,'-');
        d2.showTable();

        Display d3 = new Tail(d2,'-');
        d3.showTable();

        Display d4 = new Tail(d3,'#');
        d4.showTable();

        Display d5 = new Head(d4,'*');
        d5.showTable();

    }
}
