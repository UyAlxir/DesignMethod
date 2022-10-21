public class Test5 {
    public static void main(String[] args) {
        EagerSingletion eagerSingletion = EagerSingletion.getInstance();
        DoubleCheckLockingSingletion doubleCheckLockingSingletion = DoubleCheckLockingSingletion.getInstance();
        IoDHSingletion ioDHSingletion = IoDHSingletion.getInstance();
    }
}
