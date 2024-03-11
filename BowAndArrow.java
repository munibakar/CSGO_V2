public class BowAndArrow extends RangedWeapon {
    public static boolean isPoison;

    public static int numberOfArrows;
    public static int damage;

    public static int cost;

    public int range;

    public BowAndArrow(String name,int cost, int damage, int range,int numberOfArrows) {
        super(name);
        this.cost = cost;
        this.damage =damage;
        this.range = range;
        this.numberOfArrows = numberOfArrows;
        this.isPoison = false;
    }
    @Override
    public void shoots(Player target){
        if (BowAndArrow.numberOfArrows >0){
            if (BowAndArrow.isPoison){
                BowAndArrow.damage += 15;
                if (target.health-BowAndArrow.damage>=0){
                    target.health = target.health-BowAndArrow.damage;
                    BowAndArrow.numberOfArrows -= 1;
                    System.out.println("Success! Pinpoint accuracy!\n" +
                            "Info: There are "+ (BowAndArrow.numberOfArrows)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                            "Info: "+target.name+" health level is decreased to "+(target.health));
                    BowAndArrow.damage -= 15;
                }

            }else {
                if (target.health-BowAndArrow.damage>=0){
                    target.health -= BowAndArrow.damage;
                    BowAndArrow.numberOfArrows -= 1;
                    System.out.println("Success! Pinpoint accuracy!\n" +
                            "Info: There are "+ (BowAndArrow.numberOfArrows)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                            "Info: "+target.name+" health level is decreased to "+(target.health));
                }

            }

        }
    }


    public static int getDamage(){
        return damage;
    }

    public static boolean getisPoison(){
        return isPoison;
    }

    public static int getCost() {
        return cost;
    }

    public static int getNumberOfArrows() {
        return numberOfArrows;
    }
}
