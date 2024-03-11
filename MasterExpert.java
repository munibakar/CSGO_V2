import java.util.Random;

public class MasterExpert extends Player{


    int x;
    int y;
    public static int goneCount;

    public static boolean immortal;

    Random r=new Random();
    public MasterExpert (String name,boolean isTerrorist){
        super(name, isTerrorist);
        this.money = 1000;
        this.x = r.nextInt(100);
        this.y = r.nextInt(50);
        this.immortal = false;
    }


    public static int getGoneCount() {
        return goneCount;
    }

    public static boolean isImmortal() {
        return immortal;
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }
}
