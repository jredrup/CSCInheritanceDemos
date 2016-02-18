package p1;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Buddy";
        cat1.breed = "long hair";
        cat1.weight = 8;
        cat1.age = 6;

        Bird bird1 = new Bird();
        bird1.name = "Iago";
        bird1.breed = "Parroty thing";
        bird1.weight = 2;
        bird1.age = 50;
        System.out.println(cat1 + "\n\n" + bird1);

    }
}
//parent class
class Pet{
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    String name;
    String breed;
    double weight;
    int age;


}
//children classes
class Bird extends Pet {
    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", canTalk=" + canTalk +
                ", canFly=" + canFly +
                '}';
        return s1 + "\n" + s2;
    }

    String vocalize = "Tweet";
    int legs = 2;
    boolean canTalk = false;
    boolean canFly = false;
}

class Cat extends Pet {
    @Override
    public String toString() {
        String s1 = super.toString();//go to your parent and execute toString method
        String s2 = name + " the Cat {" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", isNeutered=" + isNeutered +
                ", isHousebroken=" + isHousebroken +
                '}';
        return s1 + "\n" + s2;
    }
    String vocalize = "Mrowr";
    int legs = 4;
    boolean isNeutered = false;
    boolean isHousebroken = true;
}
