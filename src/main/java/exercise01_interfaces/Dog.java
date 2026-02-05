package exercise_interfaces;

public class Dog implements Adoptable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public double getAdoptionFee() {
        return 150.00;
        }
}
