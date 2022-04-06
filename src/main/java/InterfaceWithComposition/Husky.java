package InterfaceWithComposition;

public class Husky extends Dog{

    RunningBehaviour runningBehaviour = new SlowRunBehaviour(); // Composition
    /*
    Why we dont have same type in above as SlowRunBehaviour?
    Because of the principle - Code to interfaces, not implementation
    It means that in your classes, whatever attributes you are going to use, try to use the attributes of the interfaces not the concrete classes.
    It will save lot of time for maintaining the code in the future

    Also there are two more principle we are following-
    1. Favour composition not inheritance
    2. SRP - Single Responsibility principle
    --> It means one class should have the single responsibility. Now, Husky class is only responsible for attributes and Behaviours of the Husky.
    --> The responsibility of defining the behaviour of the Husky is there in RunningBehaviour class.
     */

    @Override
    public void run() {
        // Override the Parent class "Dog" run because Husky wants to run slow.
        runningBehaviour.run();
    }
}
