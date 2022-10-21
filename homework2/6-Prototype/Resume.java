import java.io.*;

public class Resume implements Product{

    private String name;
    private int age;
    private Photo photo;

    public void setPhoto(int size) {
        this.photo.setSize(size);
    }

    public Resume(String name, int age, Photo photo){
        this.name=name;
        this.age=age;
        this.photo=photo;
    }

    public Resume(Resume resume){
        this.age= resume.age;
        this.name=new String(resume.name);
        this.photo= new Photo(resume.photo.getSize());
    }

    @Override
    public void print() {
        System.out.println("Resume [ Name = " + this.name + " , Age = " + this.age + " , " + this.photo + " ]");
    }

    @Override
    public Product clone() {
        Product p = null;
        try{
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e){
            System.err.println("Clone Not Supported");
        }
        return p;
    }

    @Override
    public Product deepclone() {
        Product p = new Resume(this);
        return p;
    }
}
