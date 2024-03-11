import java.util.Random;

public class MachineGun extends Firearm{
    double misfireRate;
    public static boolean isSweep;

    public static int damage;

    public static int cost;

    public int range;

    public MachineGun(String name, int cost, int damage, int range) {
        super(name);
        this.cost = cost;
        this.damage = damage;
        this.range = range;
        this.isSweep = false;
        this.misfireRate = 0.1;
        this.numberOfBullets = 10;

    }


    public static int getCost() {
        return cost;
    }
    public static int getDamage() {
        return damage;
    }
    public static boolean isSweep() {
        return isSweep;
    }


    @Override
    public int getNumberOfBullets() {
        return super.getNumberOfBullets();
    }

    @Override
    public void shoots(Player target){
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (MachineGun.numberOfBullets > 0){
            if (target.health-MachineGun.damage >0){
                double shotError = 0.1;
                if (randomNumber>shotError){
                    if (MachineGun.isSweep){
                        target.health -= MachineGun.damage;
                        MachineGun.numberOfBullets -= 10;
                        System.out.println("Success! Pinpoint accuracy!\n" +
                                "Info: There are "+ (MachineGun.numberOfBullets)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                                "Info: "+target.name+" health level is decreased to "+(target.health));
                    }else {
                        target.health -= MachineGun.damage;
                        MachineGun.numberOfBullets -= 1;
                        System.out.println("Success! Pinpoint accuracy!\n" +
                                "Info: There are "+ (MachineGun.numberOfBullets)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                                "Info: "+target.name+" health level is decreased to "+(target.health));
                    }

                }else{
                    System.out.println("Failed! "+ MachineGun.name+ " misfired!");
                }
            }else{
                System.out.println("Failed! The enemy is already dead!");
            }
        }
    }
}
