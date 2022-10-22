public class DataCorrectFilter extends Filter{

    private ProblemEnum problemEnum = ProblemEnum.DATACORRECT;

    public DataCorrectFilter(String name) {
        super(name);
    }

    @Override
    protected boolean solve(Problem problem) {
        return problem.getProblemEnum().equals(this.problemEnum);
    }
}
