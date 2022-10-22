public class CharDecodeFilter extends Filter{

    private ProblemEnum problemEnum = ProblemEnum.CHARDECODE;

    public CharDecodeFilter(String name) {
        super(name);
    }

    @Override
    protected boolean solve(Problem problem) {
        return problem.getProblemEnum().equals(this.problemEnum);
    }
}
