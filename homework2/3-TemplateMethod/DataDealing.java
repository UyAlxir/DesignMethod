public abstract class DataDealing {
    public abstract String readData();

    public abstract String cleanData(String rawData);

    public abstract String classifyData(String cleanedData);

    public final void printResult(String result){
        System.out.println(result);
    }

    public final void dataDealing(){
        String rawData = readData();
        String cleandData = cleanData(rawData);
        String result = classifyData(cleandData);
        printResult(result);
    }

}
