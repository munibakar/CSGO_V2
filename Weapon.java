public abstract class Weapon {
    public static String name;



    public Weapon(String name){
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public abstract void shoots(Player target);
}
