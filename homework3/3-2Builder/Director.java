public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void construct(){
        builder.constrcutBegin();
        builder.constructBody();
        builder.constructEngine();
        builder.constructTire();
        builder.constructGearBox();
        builder.constructFinish();
    }

}
