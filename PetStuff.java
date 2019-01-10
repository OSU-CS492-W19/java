import pets.Cat;
import pets.Dog;
// import pets.mammal.*;

class PetStuff {
  public static void main(String[] args) {
    Cat c = new Cat("Francis");
    System.out.println("The cat's name is: " + c.getName());
    System.out.println("All cats say: " + Cat.says());
    System.out.println(c.getName() + " says: " + c.says());
  }
}
