import java.util.Iterator;

public abstract class Codes implements Element{
    public abstract String getName();
    public abstract void add(Codes codes) throws MyAttributeTreatmentException;
    public Iterator iterator() throws MyAttributeTreatmentException{
        throw new MyAttributeTreatmentException();
    }
    public String toString(){
        return " ["+this.getClass().getName()+"] " + getName();
    }
    public abstract int getRows() throws MyCodeTreatmentException,MyAttributeTreatmentException;
}
