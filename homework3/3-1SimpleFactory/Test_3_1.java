import java.util.ArrayList;
import java.util.List;

public class Test_3_1 {
    public static void main(String[] args) {
        List<String> shapes= new ArrayList<String>();
        shapes.add("Circle");
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Trapezium");
        ShapeFactory shapeFactory =new ShapeFactory();
        Shape s1=null;
        for (String s:shapes) {
            try {
                s1 = shapeFactory.createAShape(s);
                s1.draw();
                s1.erase();
            } catch (UnsupportiveShapeException e) {
                e.printStackTrace();
            }
            s1 = null;
        }
    }
}
