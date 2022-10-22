public abstract class Display {
    abstract int getColumns();
    abstract int getRows();
    abstract String getLine(int row);
    public void showTable(){
        for (int i=0;i<getRows();i++){
            System.out.println(getLine(i));
        }
        System.out.println("\n");
    }
}
