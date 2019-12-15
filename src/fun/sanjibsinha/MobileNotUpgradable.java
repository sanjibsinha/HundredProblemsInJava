package fun.sanjibsinha;

public abstract class MobileNotUpgradable {

    boolean upgradable = true;

    public void youTriedToUpgrade(){
        this.upgradable = false;
    }

    public abstract double getVersion();

    public abstract void setVersion(double version);

}
