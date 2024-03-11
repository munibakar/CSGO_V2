import java.lang.reflect.Type;
import java.util.Random;

public class Player {
    public String name;
    public int health;
    public boolean isTerrorist;
    public int money;
    private int count;

    public Player(String name, boolean isTerrorist){
        this.name = name;
        this.isTerrorist = isTerrorist;
        this.health = 100;
        this.count =0;
    }

    public int getMoney() {
        return money;
    }
    RangedWeapon numberOfBullets;
    Weapon nowWeapon;
    public void buyWeapon(Weapon weapon){

        if (this instanceof BeginnerAmateur){
            if (BeginnerAmateur.goneCount <= 4){
                if (weapon instanceof Melee){
                    if (this.money >= Melee.cost){
                        this.money -= Melee.cost;
                        System.out.println("Success! " +this.name +" bought a "+ Melee.name +"\n" +
                                "Info: "+ this.name +" has now "+ this.money +" dollars!");
                        nowWeapon = weapon;

                    }else {
                        System.out.println("Failed! "+this.name+ " cannot afford it now!");
                    }

                }else{
                    System.out.println("Sorry!,amateurs can not use other weapons!");
                }

        }else {
                System.out.println("Info: Maximum weapon range reached no more weapons can be bought!");
            }


        } else if (this instanceof MasterExpert) {

            if (MasterExpert.goneCount<=1){
                if (weapon instanceof Melee && this.money >= Melee.cost){
                    this.money -= Melee.cost;
                    System.out.println("Success! " +this.name +" bought a "+ Weapon.name +"\n" +
                            "Info: "+ this.name +" has now "+ this.money +" dollars!");
                     this.count += 1;
                    nowWeapon = weapon;

                } else if (weapon instanceof BowAndArrow && this.money >= Melee.cost) {
                    this.money -= BowAndArrow.cost;
                    System.out.println("Success! " +this.name +" bought a "+ Weapon.name +"\n" +
                            "Info: "+ this.name +" has now "+ this.money +" dollars!");
                    this.count += 1;
                    nowWeapon = weapon;

                } else if (weapon instanceof MachineGun && this.money >= Melee.cost) {
                    this.money -= MachineGun.cost;
                    System.out.println("Success! " +this.name +" bought a "+ Weapon.name +"\n" +
                            "Info: "+ this.name +" has now "+ this.money +" dollars!");
                    this.count += 1;
                    nowWeapon = weapon;

                } else if (weapon instanceof  SniperRifle && this.money >= Melee.cost) {
                    this.money -= SniperRifle.cost;
                    System.out.println("Success! " +this.name +" bought a "+ Weapon.name +"\n" +
                            "Info: "+ this.name +" has now "+ this.money +" dollars!");
                    this.count += 1;
                    nowWeapon = weapon;
                }else{
                    System.out.println("Failed! "+this.name+ " cannot afford it now!");
                }

            }else{
                System.out.println("Info: Maximum range!, no more weapons can be bought!");

            }
        }

    }

    public void attack(Player target){

        if (target.isTerrorist == this.isTerrorist){
            System.out.println("Target player is on the same side!");
        }else{
            if (nowWeapon instanceof BowAndArrow && !MasterExpert.immortal){
                nowWeapon.shoots(target);

            } else if (nowWeapon instanceof SniperRifle && !MasterExpert.immortal ) {
                nowWeapon.shoots(target);

            } else if (nowWeapon instanceof MachineGun && !MasterExpert.immortal) {
                nowWeapon.shoots(target);


            } else if (nowWeapon instanceof Melee && !MasterExpert.immortal) {
                nowWeapon.shoots(target);

            } else if (nowWeapon instanceof Pistol && !MasterExpert.immortal) {
                nowWeapon.shoots(target);
            } else if (MasterExpert.immortal) {
                System.out.println("This man is immortal.No damage taken!");
            } else{
                System.out.println("No weapons available!");
            }
        }
    }
    public void fire(){
        if (!Melee.isFire){
            Melee.isFire = true;
            System.out.println("Success! Power-up successful!");
        }else {
            System.out.println("Already fired!");
        }

    }

    public void extinguishing(){
        if (Melee.isFire){
            Melee.isFire = false;
            System.out.println("Success! Extinguishing successful!");
        }else {
            System.out.println("Already extinguished!");
        }

    }

    public void turnOnSweep(){
        if (!MachineGun.isSweep){
            MachineGun.isSweep = true;
            System.out.println("Success! Sweep activated!");
        }else {
            System.out.println("Sweep is already active!");
        }
    }
    public void turnOffSweep(){
        if (MachineGun.isSweep){
            MachineGun.isSweep = false;
            System.out.println("Success! Sweep turned off!");
        }else {
            System.out.println("Sweep is already off!");
        }
    }

    public void Poison(){
        if (!BowAndArrow.isPoison){
            BowAndArrow.isPoison = true;
            System.out.println("Success! Poisoned. " +this.name+ " ready to attack");
        }else {
            System.out.println("Don't stop! it is already poisoned!");
        }
    }
    public void CleanPoison(){
        if (BowAndArrow.isPoison){
            BowAndArrow.isPoison = false;
            System.out.println("Success! Cleaned. " +this.name+ " ready to attack");
        }else {
            System.out.println("Don't stop! it is already clean!");
        }
    }

    public void openScope(){
        if (nowWeapon instanceof SniperRifle){
            if (!SniperRifle.isScope){
                SniperRifle.isScope = true;
                System.out.println("Success! Scope opened!");
            }else {
                System.out.println("Scope is already open");
            }
        }else{
            System.out.println("Sorry! This feature is not available for this weapon!");
        }
    }

    public void closeScope(){
        if (nowWeapon instanceof SniperRifle){
            if (SniperRifle.isScope){
                SniperRifle.isScope = false;
                System.out.println("Success! Scope closed!");
            }else {
                System.out.println("Scope is already close");
            }
        }else{
            System.out.println("Sorry! This feature is not available for this weapon!");
        }
    }

    public void immortality(){
        if (this instanceof MasterExpert){
            if (!MasterExpert.immortal && this.money >= 600){
                MasterExpert.immortal = true;
                this.money -= 600;
                System.out.println(this.name+" is now immortal!\n" +
                        "Info: "+ this.name +" has now "+ this.money +" dollars!");
            } else if (MasterExpert.immortal) {
                System.out.println(this.name + " is already immortal");
            }else {
                System.out.println("Sorry! Not enough money to buy immortal");
            }
        }else {
            System.out.println("Sorry! " +this.name+ " is too amateur to be immortal" );
        }
    }
    public void takeCure(){
        if (this.money >= 500 && this.health !=100){
            this.money = this.money - 500;
            this.health = 100;
            System.out.println("Success! "+this.name +" is now as fit as s(he) has never been before!\n" +
                    "Info: " +this.name+"'s health level is now 100.\n" +
                    "Info: "+ this.name +" has now "+ this.money +" dollars!");

        }else{
            System.out.println("Failed! "+this.name+ " cannot afford it now!");
        }
    }
    public void loansMoney(Player borrower, int Money){
        if (borrower.isTerrorist){
            System.out.println("Failed! Come on! Too young to be a spy!" );

        }else{
            if (this.money >= Money){
                borrower.money += Money;
                this.money -= Money;
                System.out.println("Success! "+ this.name+" is a perfect philanthropist!\n" +
                        "Info: "+ this.name+ " has now "+ this.money +" dollars!\n" +
                        "Info: "+ borrower.name+ " has now " + borrower.money +" dollars!");

            }else{
                System.out.println("Failed! "+this.name+ " cannot afford it now!");
            }
        }
    }
    public void loadMagazine(){
        if (this.money< (20 - RangedWeapon.numberOfBullets) * 5){
            System.out.println("Failed! "+this.name+" cannot afford it now!");
        }else{
            this.money = (1000 - (20 - RangedWeapon.numberOfBullets) * 5);
            RangedWeapon.numberOfBullets  = 20;
            System.out.println("Success! The real war begins now!\n" +
                    "Info: "+ this.name+" has now 20 bullets in the magazine!\n" +
                    "Info: "+ this.name+" has now " + this.money+ " dollars!");
        }
    }
}
