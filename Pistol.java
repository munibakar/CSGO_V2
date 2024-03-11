import java.util.Random;

public class Pistol extends Firearm {


    public static int damage;

    public static double pistolMisfired;
    public Pistol(String name) {
        super(name);
        this.numberOfBullets = 20;
        this.damage = 20;
        this.pistolMisfired = 0.3;
    }

    @Override
    public void shoots(Player target) {
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (Pistol.numberOfBullets >0){
            if (target.health - Pistol.damage >0){
                if (randomNumber >Pistol.pistolMisfired){
                    target.health = target.health-SniperRifle.damage;
                    Pistol.numberOfBullets -= 1;
                    System.out.println("Success! Pinpoint accuracy!\n" +
                            "Info: There are "+ (Pistol.numberOfBullets)+ " bullet(s) left in " +this.name+ "'s"+ " magazine.\n" +
                            "Info: "+target.name+" health level is decreased to "+(target.health));

                }else {
                    System.out.println("Failed! "+ Pistol.name+ " misfired!");
                }
            }
        }
    }
}
