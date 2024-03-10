//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
package march_11;


class Puppy extends Dog{
    String color;

    public Puppy(String name, String breed, String color) {

        super(name, breed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Dog {
    private String name;
    private String breed;

    static int count = 0;


    public Dog(String name, String breed) {
        count++;
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name) {
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCount(){
        return count;
    }
}
