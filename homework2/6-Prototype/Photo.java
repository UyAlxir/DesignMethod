public class Photo {
    private int Size;

    public Photo(int size) {
        this.setSize(size);
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getSize() {
        return Size;
    }

    @Override
    public String toString(){
        return "Photo [ Size = " + this.Size + "] ";
    }

}
