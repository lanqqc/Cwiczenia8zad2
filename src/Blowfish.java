public class Blowfish extends Fish implements AnimalBehavior, AnimalMove, AnimalName {

    protected boolean isGood;

    public Blowfish(String name, int age, float weight, boolean eatFish, boolean isGood) {
        super(name, age, weight, eatFish);
        this.isGood = isGood;
    }

    /*public Blowfish(String name, boolean eatFish, boolean isDanger) {
        super(name, eatFish);
        this.isGood = isGood;
    }*/

    public Blowfish() {
        super("Old rybka", 5, 2F, false);
        this.isGood = true;
    }

    /*public boolean isGood() {
        return isGood;
    }

    public void setDanger(boolean good) {
        isGood = good;
    }

    public void Inflate() {
        if (isGood())
            System.out.println("I am danger fish! Dont touch me!");
        else
            System.out.println("You can touch me!");
    } */


    @Override
    public void sleep() {
        System.out.println(getName() + " - is sleeping");
    }

    @Override
    public void move() {
        System.out.println(getName() + " - using their fins to swim");
    }

    @Override
    public void name() {
        System.out.println("Blowfish's name is " + getName());
    }
}
