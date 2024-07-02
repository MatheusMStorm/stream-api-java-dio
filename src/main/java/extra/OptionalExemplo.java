package extra;

import java.util.Optional;

/* 
 * O objetivo da Optional é fornecer uma abordagem mais segura e expressiva
 * para tratar casos em que um valor pode ser nulo.
 * Introduzida para evitar o NullPointerException
 * Podemos encapsular um valor que pode ser nulo dentro de um objeto Optional
 * Portanto, o valor pode ou não estar presente, sendo necessária uma verificação explícita
*/

/*
 * Métodos:
 * of(value): cria um Optional com o valor fornecido. Se o valor for nulo, lança uma exceção NPE
 * ofNullable(value): cria um Optional contendo o valor fornecido, porém permitindo valores nulos.
 * empty(): retorna um Optional sem valor
 * isPresent(): verifica se o Optional contém um valor não nulo
 * get(): obtém o valor contido no Optional, lançando uma exceção NoSuchElementException, caso não tenha valor
 * orElse(defaultValue): obtém o valor contido, ou retorna um valor padrão
 * orElseGet(supplier): obtém o valor contido, ou retorna um valor fornecido por um Supplier
 * orElseThrow(exceptionSupplier): obtém o valor contido, ou lança uma exceção fornecida por um Supplier
 * ifPresent(consumer): executa um Consumer caso o Optional tenha um valor
 */

public class OptionalExemplo {
    public static void main(String[] args) {
        // Método of
        Optional<String> hello = Optional.of("Hello!");
        System.out.println(hello.get());

        // Método ofNullable
        Optional<String> nothing = Optional.ofNullable(null);
        System.out.println(nothing.isPresent());

        // Método empty
        Optional<String> noOne = Optional.empty();
        System.out.println(noOne.isPresent());

        // Método isPresent
        System.out.println(hello.isPresent());

        // Método orElse
        System.out.println(nothing.orElse("Nada"));

        // Método orElseGet
        System.out.println(nothing.orElseGet(() -> "Nada, irmão"));

        // Método orElseThrow
        System.out.println(nothing.orElseThrow(() -> new RuntimeException("Tem nada aqui")));

        // Método ifPresent
        hello.ifPresent(helloMan -> System.out.println("Say " + helloMan));
    }
}
