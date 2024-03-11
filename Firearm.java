public abstract class Firearm extends RangedWeapon {

    double misfireRate;

    public Firearm(String name) {
        super(name);
        this.misfireRate = 0.3;
        this.numberOfBullets = 20;
    }


    public abstract void shoots(Player target);
}
