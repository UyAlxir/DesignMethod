public class Util {
    protected static String MakeLine(int sz,Character ch){
        StringBuffer buf= new StringBuffer();
        for (int i=0;i<sz;i++){
            buf.append(ch);
        }
        return buf.toString();
    }
}
