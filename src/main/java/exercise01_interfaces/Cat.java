package exercise_interfaces;

public class Cat implements Adoptable {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
    public String makeSound(){
        return "Meow!";
    }

    @Override
    public double getAdoptionFee() {
        return 100.00;
    }
}
