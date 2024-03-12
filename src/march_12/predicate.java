package march_12;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        String num1 = "+919981578322";
        String num2 = "08770657683";

        System.out.println("Is the phone number valid? "+ isPhoneNumberValid.test(num1));
        System.out.println("Is the phone number valid? "+ isPhoneNumberValid.test(num2));
        System.out.println("Is the phone number valid and has 3? "+ isPhoneNumberValid.and(containsNumber3).test(num1));
        System.out.println("Is the phone number valid and has 3? "+ isPhoneNumberValid.and(containsNumber3).test(num2));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("+91") && phoneNumber.length() == 13;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
