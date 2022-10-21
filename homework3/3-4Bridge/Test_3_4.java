import java.util.ArrayList;
import java.util.List;

public class Test_3_4 {
    static List<Image> imgs;
    public static void main(String[] args) {
        Addimgs();
        Blur p1 = null;
        // Blur
        for(Image img:imgs){
            p1 = new Blur(img);
            p1.processBlur();
            System.out.println();
        }

        // Cutout
        Cutout p2 = null;
        for(Image img:imgs){
            p2 = new Cutout(img);
            p2.processCutout();
            System.out.println();
        }

        // Sharpen
        Sharpen p3 = null;
        for(Image img:imgs){
            p3 = new Sharpen(img);
            p3.processSharpen();
            System.out.println();
        }

        // Texture
        Texture p4;
        for(Image img:imgs){
            p4 = new Texture(img);
            p4.processTexture();
            System.out.println();
        }
    }

    static void Addimgs(){
        imgs = new ArrayList<Image>();
        imgs.add(new BMP());
        imgs.add(new GIF());
        imgs.add(new JPG());
    }
}
