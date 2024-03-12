package march_12;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Maria", "9999");
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerv2.accept(customer, false);  //v2 is biConsumer
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customerName + ", thanks for registering phone no. "+ customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer, showPhoneNumber) ->
            System.out.println("Hello" + customer.customerName + ", thanks for registering phone no. "+ (showPhoneNumber? customer.customerPhoneNumber: "****"));
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
