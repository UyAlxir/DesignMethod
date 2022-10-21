public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw a new "+this.getClass().getName());
    }

    @Override
    public void erase() {
        System.out.println("Erase the "+this.getClass().getName());
    }
}
