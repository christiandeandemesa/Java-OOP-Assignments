class Bat extends Mammal {

    // Constructor
    public Bat() {
        super();
        this.energyLevel = 300;
    }

    // Decrease bat's energy level
    public void fly() {
        if(energyLevel >= 50) {
            System.out.printf("Na na na na na na na na na na na na na na na na BAT!!!\n");
            energyLevel -= 50;
            super.displayEnergy();
        }
        else {
            System.out.printf("The bat doesn't have enough energy.\n");
            super.displayEnergy();
        }
    }

    // Increase bat's energy level
    public void eatHumans() {
        System.out.printf("I vant do drink vour blood. Blah blah blah.\n");
        energyLevel += 25;
        super.displayEnergy();
    }

    // Decrease bat's energy level
    public void attackTown() {
        if(energyLevel >= 100) {
            System.out.printf("We didn't start the fire. It was always burning since the world's been turning.\n");
            energyLevel -= 100;
            super.displayEnergy();
        }
        else {
            System.out.printf("The bat doesn't have enough energy.\n");
            super.displayEnergy();
        }
    }

}