interface animal{
void sound();
}

class dog implements animal{
   public void sound(){
        System.out.println("i am a dog");
    }
}
class cat implements animal{
    public void sound(){
        System.out.println("i am a cat");
        }
    }
class tiger implements animal{
    public void sound(){
        System.out.println("i am a tiger");
    }
}
class animalfactory {

    public static animal getAnimal(String type) {

        if (type.equalsIgnoreCase("Dog")) {
            return new dog();
        }
        else if (type.equalsIgnoreCase("Cat")) {
            return new cat();
        }
        else if (type.equalsIgnoreCase("Tiger")) {
            return new tiger();
        }

        return null;
    }
}
public class Excercise_two {
    public static void main(String[] args) {
        animal a1 = animalfactory.getAnimal("dog");
        animal a2 = animalfactory.getAnimal("cat");
        animal a3 = animalfactory.getAnimal("tiger");

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
