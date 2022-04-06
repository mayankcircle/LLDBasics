public class Horse extends Animal implements Walkable,Runnable,Sleepable{
    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }

    // Override the parent method

    @Override
    public void make_sound() {
        super.make_sound(); // Parent Method call
        System.out.println("Hurr Hurr Hurr ...");
    }
}
