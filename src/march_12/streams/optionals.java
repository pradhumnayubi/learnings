package march_12.streams;

import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
        Optional.ofNullable("pradhumnarajput@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending e-email to : "+ email),
                        () -> System.out.println("Cannot send e-mail"));
    }
}
