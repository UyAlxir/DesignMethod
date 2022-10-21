public class Sharpen extends Process{
    public Sharpen(Image image) {
        super(image);
    }

    public void processSharpen(){
        System.out.println("==== "+ this.getClass().getName() + " =====");
        imageProcess();
        System.out.println("==== "+ this.getClass().getName() + " =====");
    }
}
