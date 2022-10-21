public class Blur extends Process{
    public Blur(Image image) {
        super(image);
    }

    public void processBlur(){
        System.out.println("==== "+ this.getClass().getName() + " =====");
        imageProcess();
        System.out.println("==== "+ this.getClass().getName() + " =====");
    }
}
