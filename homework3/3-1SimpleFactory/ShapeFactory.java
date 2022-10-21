
public class ShapeFactory {

    public Shape createAShape(String shape) throws UnsupportiveShapeException{
        if(shape.equals("Circle")){
            return new Circle();
        } else if(shape.equals("Rectangle")){
            return new Rectangle();
        } else if(shape.equals("Triangle")){
            return new Triangle();
        } else {
            throw new UnsupportiveShapeException();
        }
    }
}
