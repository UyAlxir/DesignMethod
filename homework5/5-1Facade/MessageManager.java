public class MessageManager {
    public static String getProperty() {
        String data=((String)Thread.currentThread().getStackTrace()[1].getClassName()).replace("Manager","");
        System.out.println("Get Data from [ " + data + " ]");
        return data;
    }
}
