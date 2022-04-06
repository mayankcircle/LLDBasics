package InterfaceWithComposition;

import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Runnable> animals = List.of(
                new Dog(),
                new Husky(),
                new Labrador(),
                new Cat(),
                new Monkey()
        );

        for (Runnable as: animals){
            as.run();
        }


    }
}
