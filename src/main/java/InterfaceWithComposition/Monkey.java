package InterfaceWithComposition;

public class Monkey extends Animal implements Runnable, Sleepable{

    RunningBehaviour runningBehaviour = new SlowRunBehaviour(); // Composition
    @Override
    public void sleep() {

    }

    @Override
    public void run() {
        runningBehaviour.run();

    }
}
