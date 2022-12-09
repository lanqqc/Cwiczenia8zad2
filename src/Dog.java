public class Dog extends Mammal implements AnimalBehavior, AnimalMove, AnimalName {

    public Dog() {
        super("Jina", 2, 15F, "Red");
    }

    public Dog(String name, int age, float weight, String colorWool) {
        super(name, age, weight, colorWool);
    }


    @Override
    public void eat() {
        System.out.println("Dog is eating meat!");
    }

    /*@Override
    public void getVoice() {
        System.out.println("Dog is barking...");
    } */


    @Override
    public void sleep() {
        System.out.println(getName() + " - is sleeping!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " - is walking on 4 legs");
    }

    @Override
    public void name() {
        System.out.println("Dog's name is " + getName());
    }
}
