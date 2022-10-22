public class Problem {
    private ProblemEnum problemEnum;
    private String name;
    public Problem(String name,ProblemEnum problemEnum){
        this.name=name;
        this.problemEnum=problemEnum;
    }

    public String toString(){
        return "[ " + this.problemEnum.toString() + "Problem: "+this.name+ " ]";
    }

    public ProblemEnum getProblemEnum(){
        return this.problemEnum;
    }
}
