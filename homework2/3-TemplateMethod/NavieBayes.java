public class NavieBayes extends DataDealing{
    private String path;
    public NavieBayes(String path){
        this.path=path;
    }

    @Override
    public String readData() {
        return "data from :"+this.path;
    }

    @Override
    public String cleanData(String rawData) {
        return rawData;
    }

    @Override
    public String classifyData(String cleanedData) {
        return "classified by " + this.getClass().getName() + "\n" + cleanedData +"\n";
    }

}
