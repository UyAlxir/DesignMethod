public class Texture extends Process{

    public Texture(Image image) {
        super(image);
    }

    public void processTexture(){
        System.out.println("==== "+ this.getClass().getName() + " =====");
        imageProcess();
        System.out.println("==== "+ this.getClass().getName() + " =====");
    }
}
