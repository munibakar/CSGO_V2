public class Melee extends Weapon{
     public static boolean isFire;
    public static int damage;

    public static int cost;

    public int range;

    public Melee(String name,int cost,int damage,int range) {
        super(name);
        this.cost = cost;
        this.damage =damage;
        this.range = range;
        this.isFire = false;
    }



    public static int getDamage(){
        return damage;
    }

    public static boolean getisFire(){
        return isFire;
    }

    public static int getCost() {
        return cost;
    }

    @Override
    public void shoots(Player target){
        if (Melee.isFire){
            Melee.damage +=5;
            if (target.health-Melee.damage>0){
                target.health-=Melee.damage;
                System.out.println("Success! Pinpoint accuracy!\n" +
                        "Info: "+target.name+" health level is decreased to "+(target.health));
                Melee.damage -= 5;
            }
        }else{
            if (target.health-Melee.damage>0){
                target.health -= Melee.damage;
                System.out.println("Success! Pinpoint accuracy!\n" +
                        "Info: "+target.name+" health level is decreased to "+(target.health));
            }
        }
    }
}
