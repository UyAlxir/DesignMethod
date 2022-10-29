public class Query implements Queriable{
    @Override
    public String Query(String query) {
        HeavyJob();
        return "[ " + query + " ]";
    }

    private void HeavyJob(){
        System.out.println("Asking from Query");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
            System.out.print(".");
        }
        System.out.println(" Done");
    }
}
