import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Animal animal = new Animal(); // It will work
        animal.name = "xyz";
        animal.age = 24;
        animal.color = "red";
        animal.weight = 124;
        //animal.breed = "abccc"; // we can not do this because breed is the attribute in child class i.e Dog, not in same class or parent class

        Dog dog = new Dog(); // It will work
        dog.name = "abc"; // we can do this because these attributes are inherited from parent class i.e Animal.
        dog.color = "black"; // we can do this because these attributes are inherited from parent class i.e Animal.
        dog.age = 30; // we can do this because these attributes are inherited from parent class i.e Animal.
        dog.weight = 120; // we can do this because these attributes are inherited from parent class i.e Animal.
        dog.hairColor = "Black"; // we can do this because this is the attribute in Dog Class
        dog.breed = "Sibarian"; // we can do this because this is the attribute in Dog Class

        animal = dog; // It will work because "Dog" is a "Animal"

        // dog = animal; // it will not work

        // Runtime Polymorphism
        Animal gh = new Dog();
        //gh.breed // even if breed is the attribute of Dog, we can not use it
                   // because gh is of type Animal and compiler can access only Animl class or its Parent class (if any), not subclasses.
        // Here Polymorphism means-
        //You dont need to know the exact data type of an object.
        //You will be able to use the properties/behaviour that you need.
        // Above breed is the attribute of exact data type that is Dog.
        // Polymorphism will not allow us to use only the attributes of variable type that is Animal, not exact data type.
        // It is useful Because later it can be Cat() and then it will break our code.
        // Thats why we need variable type which is compatible for both Dog and Cat

        List<Animal> animals = List.of(
                new Dog(),
                new Cat(),
                new Labrador(),
                new GermanShepard(),
                new Husky(),
                new Penguin()
        );

        for (Animal as : animals){
            as.make_sound(); // We can use only variable type attributes/behaviour here that is Animal.
            // as.hairColor // we can not access because hairColor is the attribute of exact data type that is Dog
        }

        Animal Missi = new Husky(); // It will work because Husky "is a" Dog and Dog "is a" Animal

        /*
        Husky Class takes implementation of make_sound() from its Parent class - Dog (Unless it overrides)
        Dog Class takes implementation of make_sound() from its Parent class - Animal (Unless it overrides)
        Husky --> Dog --> Animal --> Object
         */
        Missi.make_sound();


        // We can not create instances from interface or abstract class
        // Runnable a = new Runnable() ;

        // But we can create Runnable object from Husky because Husky "is a" Dog and  Dog "is a" Runnable.
        Runnable a = new Husky();
        a.run();

        // we can not do below because sleep and walk method is not defined in Parent Class i.e "Runnable" interface.
        //a.sleep();
        //a.walk();

        // Beauty of interfaces
        /*
        List<Runnable> = new ArrayList<>(List.of(
                new Dog(),
                new Cat(),
                new Horse()
        ));

         */

    }
}
