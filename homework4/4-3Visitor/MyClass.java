import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyClass extends Codes {
    private String name;
    private int rows;
    private List<Codes> codesList = new ArrayList<Codes>();

    public MyClass(String name,int rows){
        this.name=name;
        this.rows=rows;
    }

    public Iterator iterator(){
        return codesList.iterator();
    }

    @Override
    public int getRows() throws MyCodeTreatmentException, MyAttributeTreatmentException {
        return rows;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void add(Codes codes) {
        codesList.add(codes);
    }
}
