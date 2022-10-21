public class Test_3_5 {
    public static void main(String[] args) {
        Copy c1 = new Copy(new PreCopy());
        Copy c2 = new Copy(new PostCopy());
        Copy c3 = new Copy(new CRRTMotion());
        c1.CopyFile();
        c2.CopyFile();
        c3.CopyFile();
    }
}
