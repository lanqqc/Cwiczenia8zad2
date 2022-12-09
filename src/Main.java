import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Blowfish nemo = new Blowfish("Rybka", 31, 1.0f, true, true);
        Blowfish blowfish = new Blowfish();
        Dog dog = new Dog();
        Pigeon pigeon = new Pigeon();
        List<AnimalBehavior> arrayListBehavior = new ArrayList<>();
        arrayListBehavior.add(nemo);
        arrayListBehavior.add(dog);
        arrayListBehavior.add(pigeon);

        for(AnimalBehavior animal: arrayListBehavior){
            animal.sleep();
        }
        System.out.println("--------------------------------------");

        List<AnimalMove> arrayListMove = new ArrayList<>();
        arrayListMove.add(blowfish);
        arrayListMove.add(dog);
        arrayListMove.add(pigeon);

        for(AnimalMove animal: arrayListMove){
            animal.move();
        }
        System.out.println("--------------------------------------");

        List<AnimalName> arrayListName = new ArrayList<>();
        arrayListName.add(blowfish);
        arrayListName.add(dog);
        arrayListName.add(pigeon);

        for(AnimalName animal: arrayListName){
            animal.name();
        }




        /*System.out.println(nemo);
        System.out.println(mammal.getAge());
        System.out.println(mammal.getName());
        System.out.println(mammal.getWeight());
        System.out.println(mammal.getColorWool());*/



    }
}
