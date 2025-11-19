package package1;

public class TestInSamePackage {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        base.printFields();

        SamePackageClass sp = new SamePackageClass();
        sp.test();
    }
}