package march_12.combinator;

import java.time.LocalDate;

import static march_12.combinator.CustomerRegistrationValidator.*;
import static march_12.combinator.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+918770657687",
                LocalDate.of(2000,1,1)

        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
