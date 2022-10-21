public class OffRoadRacing extends Builder{
    @Override
    void constructBody() {
        System.out.println("Construct the Body of Your "+this.getClass().getName()) ;
    }

    @Override
    void constructEngine() {
        System.out.println("Construct the Engine of Your "+this.getClass().getName()) ;
    }

    @Override
    void constructTire() {
        System.out.println("Construct the Tire of Your "+this.getClass().getName()) ;
    }

    @Override
    void constructGearBox() {
        System.out.println("Construct the GearBox of Your "+this.getClass().getName()) ;
    }

    @Override
    void constructFinish() {
        System.out.println("\n========== Constructing "+this.getClass().getName()+" finished ==========\n");
    }

    @Override
    void constrcutBegin() {
        System.out.println("\n========== Begin to construct the " +this.getClass().getName() + " ==========\n");
    }

}
