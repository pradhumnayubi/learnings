package march_12;

import java.util.function.Consumer;

public class callback {
    public static void main(String[] args) {
        hello("Anuj",null, value ->{
            System.out.println("No last name provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    }
}
