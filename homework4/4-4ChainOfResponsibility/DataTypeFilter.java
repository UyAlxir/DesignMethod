public class DataTypeFilter extends Filter{

    private ProblemEnum problemEnum = ProblemEnum.DATATYPE;

    public DataTypeFilter(String name) {
        super(name);
    }

    @Override
    protected boolean solve(Problem problem) {
        return problem.getProblemEnum().equals(this.problemEnum);
    }
}
