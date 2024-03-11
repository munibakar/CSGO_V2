public abstract class RangedWeapon extends Weapon {
    public static int numberOfBullets;


    public RangedWeapon(String name) {
        super(name);
    }

    public int getNumberOfBullets() {
        return numberOfBullets;
    }

    public abstract void shoots(Player target);
}
