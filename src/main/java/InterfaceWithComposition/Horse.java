package InterfaceWithComposition;

public class Horse extends Animal implements Runnable,Sleepable{

    RunningBehaviour runningBehaviour = new FastRunBehaviour();
    /*
    Why we dont have same type in above as FastRunBehaviour?
    Because of the principle - Code to interfaces, not implementation
    It means that in your classes, whatever attributes you are going to use, try to use the attributes of the interfaces not the concrete classes.
    It will save lot of time for maintaining the code in the future

    Also there are two more principle we are following-
    1. Favour composition not inheritance
    2. SRP - Single Responsibility principle
    --> It means one class should have the single responsibility. Now, Horse class is only responsible for attributes and Behaviours of the Horse.
    --> The responsibility of defining the behaviour of the Dog is there in RunningBehaviour class.
     */

    @Override
    public void run() {
        runningBehaviour.run();

    }

    @Override
    public void sleep() {

    }
}
