//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

package march_11;

public class oops {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tiger");
        Dog d2 = new Dog("Blu","Golden Retriever");
        System.out.println("Name: "+ d1.getName() + " , Breed: "+d1.getBreed());
        System.out.println("Name: "+ d2.getName() + " , Breed: "+d2.getBreed());
        System.out.println("No. of dogs are: "+ Dog.count);

        Puppy p1 = new Puppy("Coffee", "Labrador","White");
        System.out.println("Name: "+ p1.getName() + " , Breed: "+p1.getBreed());
        System.out.println("Woof! Woof!, I'm a cute puppy");
    }
}
