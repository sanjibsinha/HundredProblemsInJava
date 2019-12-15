package fun.sanjibsinha;

public class ProblemNinetyEight {

    public static void main(String[] args) {
        AnotherMobileClass another = new AnotherMobileClass();
        another.youTriedToUpgrade();
        if(another.upgradable){
            System.out.println("This mobile is upgradable");
        } else {
            System.out.println("This mobile is not upgradable");
        }
        another.setVersion(2.0);
        System.out.println(another.getVersion());
        System.out.println();
        MobileNotUpgradable m = new MobileNotUpgradable() {
            double version;
            @Override
            public double getVersion() {
                return version;
            }

            @Override
            public void setVersion(double version) {
                this.version = version;

            }
        };
        m.setVersion(3.0);
        System.out.println(m.getVersion());
    }
}
