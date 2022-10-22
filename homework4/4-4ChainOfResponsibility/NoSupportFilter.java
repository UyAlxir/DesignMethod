public class NoSupportFilter extends Filter{

    public NoSupportFilter(String name) {
        super(name);
    }

    @Override
    protected boolean solve(Problem problem) {
        return false;
    }
}
