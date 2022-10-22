
public class MyAttribute extends Codes {
    private String name;

    public MyAttribute(String name){
        this.name=name;
    }

    @Override
    public int getRows() throws MyCodeTreatmentException, MyAttributeTreatmentException {
        throw new MyAttributeTreatmentException();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void add(Codes codes) throws MyAttributeTreatmentException{
        throw new MyAttributeTreatmentException();
    }
}
