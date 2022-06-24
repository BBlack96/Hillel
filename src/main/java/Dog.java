public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog " + super.getName() + " says: Woof");

    }

    void greets(Dog another) {
        System.out.println("Wooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + super.getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + super.getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + getName());

    }
}
