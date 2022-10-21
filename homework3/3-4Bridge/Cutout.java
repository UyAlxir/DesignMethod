public class Cutout extends Process{
    public Cutout(Image image) {
        super(image);
    }

    public void processCutout(){
        System.out.println("==== "+ this.getClass().getName() + " =====");
        imageProcess();
        System.out.println("==== "+ this.getClass().getName() + " =====");
    }
}
