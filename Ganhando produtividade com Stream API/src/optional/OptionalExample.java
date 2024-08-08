package optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Hello World!");
        System.out.println(optionalValue.get());

        String nullableValue = null;
        Optional<String> optional = Optional.ofNullable(nullableValue);
        System.out.println(optional.isPresent());

        Optional<String> optionalsEmpty = Optional.of("Hello World!");
        System.out.println(optionalsEmpty.isEmpty());

        String nullableValue1 = null;
        Optional<String> optionalSupplier = Optional.ofNullable(nullableValue1);
        String result = optionalSupplier.orElseGet(() -> "Default");
        System.out.println(result);

        Optional<String> optionalValue2 = Optional.of("Hello World!");
        optionalValue2.ifPresent(value -> System.out.println("Valor presente: " + value));

    }
    
}
