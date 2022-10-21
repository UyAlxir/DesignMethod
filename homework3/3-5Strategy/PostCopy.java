public class PostCopy implements CopyAlgorithm{
    @Override
    public void uses() {
        System.out.println("Using "+this.getClass().getName()+" Algorithm");
    }
}
