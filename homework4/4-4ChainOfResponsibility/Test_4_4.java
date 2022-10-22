public class Test_4_4 {
    public static void main(String[] args) {
        Filter Emet = new CharDecodeFilter("Emet");
        Filter Memet = new DataCorrectFilter("Memet");
        Filter Semet = new DataTypeFilter("Semet");
        Filter Appah = new NoSupportFilter("Appah");
        Problem Oghri = new Problem("Oghri",ProblemEnum.DATACORRECT);
        Problem Qaraqchi = new Problem("Qaraqchi",ProblemEnum.CHARDECODE);
        Problem Munapiq = new Problem("Munapiq",ProblemEnum.DATATYPE);
        Problem Satqin = new Problem("Sarqin",ProblemEnum.UNKNOWN);
        Appah.setNext(Emet).setNext(Memet).setNext(Semet);
        Appah.Final(Oghri);
        Appah.Final(Qaraqchi);
        Appah.Final(Munapiq);
        Appah.Final(Satqin);
    }
}
