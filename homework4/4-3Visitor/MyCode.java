import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCode extends Codes{
    private String name;
    private List<Codes> codesList = new ArrayList<Codes>();

    public MyCode(String name){
        this.name=name;
    }

    public Iterator iterator(){
        return codesList.iterator();
    }

    @Override
    public int getRows() throws MyCodeTreatmentException, MyAttributeTreatmentException {
        throw new MyCodeTreatmentException();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Codes codes) {
        codesList.add(codes);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
