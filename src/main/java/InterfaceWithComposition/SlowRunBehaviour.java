package InterfaceWithComposition;

public class SlowRunBehaviour implements RunningBehaviour {
    @Override
    public void run() {
        System.out.println("Animal is running slow ....");
    }
}
