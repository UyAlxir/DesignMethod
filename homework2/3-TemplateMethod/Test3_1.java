public class Test3_1 {
    public static void main(String[] args) {
        DataDealing d1 = new NavieBayes("Test1");
        DataDealing d2 = new DecisionTree("Test2");
        DataDealing d3 = new KNearestNeighbour("Test3");
        d1.dataDealing();
        d2.dataDealing();
        d3.dataDealing();
    }
}
