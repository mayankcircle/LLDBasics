public class Dolphin extends Animal implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Swimming ...");
    }

    // Override the parent method

    @Override
    public void make_sound() {
        super.make_sound(); // Parent Method call
        System.out.println("Dttt Dttt Dttt ...");
    }
}
