public class Dog extends Animal implements Walkable,Runnable,Sleepable{

    String hairColor;
    String breed;

    @Override
    public void run() {
        System.out.println("Running ...");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping zzzzzzzzz ...");

    }

    @Override
    public void walk() {
        System.out.println("Waling ...");
    }

    // Override the parent method

    @Override
    public void make_sound() {
        super.make_sound(); // Parent Method call
        System.out.println("Bhow Bhow Bhow ...");
    }
}
