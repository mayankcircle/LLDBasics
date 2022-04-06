public class Penguin extends Animal implements Walkable,Sleepable{
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
        System.out.println("Teeee Teeee Teeee ...");
    }
}
