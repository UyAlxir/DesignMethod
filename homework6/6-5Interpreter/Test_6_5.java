import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

public class Test_6_5 {
    public static void main(String[] args) throws IOException, ParseException {
        String command ;
        BufferedReader reader = new BufferedReader(new FileReader("homework6/6-5Interpreter/command.txt"));
        while((command=reader.readLine())!=null){
            System.out.println("command = " + command);
            Node cmd = new Commands();
            cmd.parse(new Context(command));
            System.out.println("Node = " + cmd);
        }
    }
}
