public class Tail extends Border{

    private char ch;

    public Tail(Display display,char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    int getColumns() {
        return display.getColumns();
    }

    @Override
    int getRows() {
        return display.getRows()+3;
    }

    @Override
    String getLine(int row) {
        if(row < display.getRows()){
            return display.getLine(row);
        } else {
            row -= display.getRows();
            if(row==0||row==2){
                return Util.MakeLine(display.getColumns(),ch);
            } else return Util.MakeLine((display.getColumns()-6)/2 ,ch) +
                        " Tail " +
                        Util.MakeLine((display.getColumns()-5)/2 ,ch);
        }
    }
}
