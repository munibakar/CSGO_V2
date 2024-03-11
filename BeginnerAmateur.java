import java.util.Random;

public class BeginnerAmateur extends Player {

    int x;
    int y;

    public static int goneCount;

    Random r=new Random();

    public BeginnerAmateur(String name,boolean isTerrorist){
        super(name,isTerrorist);
        this.money = 500;
        this.x = r.nextInt(100);
        this.y = r.nextInt(50);
        this.goneCount = 0;

    }

    public static int getGoneCount() {
        return goneCount;
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }
}
