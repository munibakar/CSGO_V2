public class Game {
    public static void main(String[] args) {
        MasterExpert player2 = new MasterExpert("TERRORIST_1", true);
        MasterExpert player5 = new MasterExpert("SOLDIER_2", false);
        MasterExpert player3 = new MasterExpert("SOLDIER_3", false);
        BeginnerAmateur player4 = new BeginnerAmateur("TERRORIST_2", true);
        BeginnerAmateur player1 = new BeginnerAmateur("SOLDIER_1", false);

        Melee melee = new Melee("Knife",100,5,10);

        BowAndArrow bowAndArrow = new BowAndArrow("Bow and Arrow",40,10,1,7);

        MachineGun machineGun = new MachineGun("Machine Gun",100,20,2);

        SniperRifle sniperRifle = new SniperRifle("Sniper Rifle", 40, 500, 55);

        Pistol pistol = new Pistol("Pistol");





        // Testing the buyWeapon method.
        System.out.println("Operation #1:SOLDIER_1 buy weapon");
        player1.buyWeapon(melee);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #2:TERRORIST_2 buy weapon");
        player4.buyWeapon(bowAndArrow);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #3:TERRORIST_1 buy weapon");
        player2.buyWeapon(melee);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #4:SOLDIER_3 buy weapon");
        player3.buyWeapon(machineGun);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #5:TERRORIST_1 buy weapon");
        player2.buyWeapon(sniperRifle);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #6:SOLDIER_2 buy weapon");
        player5.buyWeapon(machineGun);
        System.out.println("--------------------------------------------------------");



        // Testing the attack method.

        System.out.println("Operation #7: SOLDIER_1 attack to TERRORIST_1");
        player4.attack(player2);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #8: SOLDIER_3 attack to TERRORIST_1");
        player3.attack(player4);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #9: SOLDIER_2 attack to TERRORIST_1");
        player5.attack(player2);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #10: SOLDIER_2 attack to TERRORIST_1");
        player5.attack(player2);
        System.out.println("--------------------------------------------------------");

        System.out.println("Operation #11: SOLDIER_2 attack to TERRORIST_1");
        player5.attack(player2);
        System.out.println("--------------------------------------------------------");


        // Testing the loadMagazine method.

        System.out.println("Operation #12: SOLDIER_2 loads magazine");
        player5.loadMagazine();
        System.out.println("---------------------------------------------------------");

        // Testing the fire weapon method.
        System.out.println("Operation #13: SOLDIER_1 fire melee");
        player1.fire();
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #14: SOLDIER_1 fire melee");
        player1.fire();
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #15: SOLDIER_1 extinguishing melee");
        player1.extinguishing();
        System.out.println("---------------------------------------------------------");

        // Testing the take cure method.
        System.out.println("Operation #16: TERRORIST_1 takes cure");
        player2.takeCure();
        System.out.println("---------------------------------------------------------");

        // Testing the Scope methods.
        System.out.println("Operation #17: TERRORIST_1 open the scope");
        player2.openScope();
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #18: TERRORIST_1 close the scope");
        player2.closeScope();
        System.out.println("---------------------------------------------------------");

        // Testing the turn on-off sweep methods.
        System.out.println("Operation #19: SOLDIER_3 turn on sweep");
        player3.turnOnSweep();
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #20: SOLDIER_3 turn on sweep");
        player3.turnOnSweep();
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #21: SOLDIER_3 turn off sweep");
        player3.turnOffSweep();
        System.out.println("---------------------------------------------------------");

        // Testing the loanMoney method.

        System.out.println("Operation #22: SOLDIER_1 loans money to TERRORIST_1");
        player1.loansMoney(player2,100);
        System.out.println("---------------------------------------------------------");

        System.out.println("Operation #22: SOLDIER_1 loans money to SOLDIER_3");
        player1.loansMoney(player3,100);
        System.out.println("---------------------------------------------------------");









    }


}
