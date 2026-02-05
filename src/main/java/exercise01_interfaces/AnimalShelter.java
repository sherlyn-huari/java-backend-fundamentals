package exercise_interfaces;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    public static void main(String[] args){
        List<Adoptable> animals = new ArrayList<>();

        animals.add(new Dog("Buddy", 3 ));
        animals.add(new Cat("Whiskers", 2));
        animals.add(new Dog("Max", 5));
        animals.add(new Cat("Luna", 1));

        // Process all animals the same way
        for (Adoptable animal: animals){
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Sound: " + animal.makeSound());
            System.out.println("Adoption Fee: " + animal.getAdoptionFee());
        }

        // Calculate total adoption fees
        double totalFees = 0;
        for(Adoptable animal : animals){
            totalFees += animal.getAdoptionFee();
        }
        System.out.println("Total adoption Fees: $" + totalFees);
    }
}
