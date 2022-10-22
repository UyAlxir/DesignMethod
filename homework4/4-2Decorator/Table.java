public class Table extends Display {
    String []table  ;

    public Table(String content){
        table = new String[3];
        table[1]="="+content+"=";
        table[2]=table[0]=new String(Util.MakeLine(content.length()+2,'='));
    }

    @Override
    int getColumns() {
        return table[1].length();
    }

    @Override
    int getRows() {
        return 3;
    }

    @Override
    String getLine(int row) {
        if(row<3)return table[row];
        else return null;
    }
}
