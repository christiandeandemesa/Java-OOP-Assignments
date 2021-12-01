class Mammal {

    // Member variable is public so the Gorilla class can inherit it
    public int energyLevel = 10;

    // Shows the mammal's energy level
    public int displayEnergy() {
        System.out.printf("It's energy level is %d", energyLevel);
        return energyLevel;
    }
}