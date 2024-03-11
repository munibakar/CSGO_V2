import java.util.Random;

public class SniperRifle extends Firearm{
    double misfireRate;

    public static boolean isScope;


    public static int damage;

    public static int cost;

    public int range;







    public SniperRifle(String name, int cost, int damage, int range) {
        super(name);
        this.cost = cost;
        this.damage = damage;
        this.range = range;
        this.isScope = false;
        this.numberOfBullets = 100;
        this.misfireRate = 0.1;

    }

    public static int getCost() {
        return cost;
    }

    @Override
    public void shoots(Player target){
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (SniperRifle.numberOfBullets >0){
            if (target.health - SniperRifle.damage>0){
                if (SniperRifle.isScope){
                    double shotError = 0.45;
                    if (randomNumber > shotError){
                        target.health = target.health-SniperRifle.damage;
                        SniperRifle.numberOfBullets -= 1;
                        System.out.println("Success! Pinpoint accuracy!\n" +
                                "Info: There are "+ (SniperRifle.numberOfBullets)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                                "Info: "+target.name+" health level is decreased to "+(target.health));

                    }else{
                        System.out.println("Failed! "+ SniperRifle.name+ " misfired!");
                    }

                }else {
                    double shotError = 0.01;
                    if (randomNumber>shotError){
                        target.health = target.health -SniperRifle.damage;
                        SniperRifle.numberOfBullets -= 1;
                        System.out.println("Success! Pinpoint accuracy!\n" +
                                "Info: There are "+ (SniperRifle.numberOfBullets)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                                "Info: "+target.name+" health level is decreased to "+(target.health));

                    }else{
                        System.out.println("Failed! "+ SniperRifle.name+ " misfired!");
                    }
                }
            }else {
                System.out.println("Failed! The enemy is already dead!");
            }

        }
    }

    @Override
    public int getNumberOfBullets() {
        return super.getNumberOfBullets();
    }

    public static boolean isScope() {
        return isScope;
    }

    public static int getDamage() {
        return damage;
    }
}
