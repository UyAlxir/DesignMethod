public class SDCard{
    public static void Save(String data){
        System.out.println("Save [ " + data + " ] to Storage [ " + Thread.currentThread().getStackTrace()[1].getClassName() + " ]");
    }
}
