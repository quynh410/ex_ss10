package bai8;

public class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }

    @Override
    public String makeSound() {
        return "gau gau";
    }
}
