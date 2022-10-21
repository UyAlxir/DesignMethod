public class Copy {
    private CopyAlgorithm copyAlgorithm;
    public Copy(CopyAlgorithm copyAlgorithm){
        this.copyAlgorithm=copyAlgorithm;
    }
    public void CopyFile(){
        copyAlgorithm.uses();
    }
}
