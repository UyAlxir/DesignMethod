public abstract class Filter {
    private String name;
    private Filter next=null;
    public Filter(String name){
        this.name= name;
    }
    public Filter setNext(Filter filter){
        this.next=filter;
        return filter;
    }

    protected abstract boolean solve(Problem problem);

    public void Final(Problem problem){
        if(solve(problem)){
            System.out.println(problem.toString() + " Has Been Solved by "+ this.getClass().getName());
        } else if(next!=null){
            next.Final(problem);
        } else {
            System.out.println(problem.toString() + " Cannot be solved by Any Filter");
        }
    }

}
