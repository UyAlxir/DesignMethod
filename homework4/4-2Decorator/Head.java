public class Head extends Border{

    private char ch;

    public Head(Display display , char ch) {
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
        if(row==0||row==2){
            return Util.MakeLine(display.getColumns(),ch);
        } else if(row == 1){
            return Util.MakeLine((display.getColumns()-6)/2 ,ch) +
                    " Head " +
                    Util.MakeLine((display.getColumns()-5)/2 ,ch);
        } else return display.getLine(row-3);
    }
}
