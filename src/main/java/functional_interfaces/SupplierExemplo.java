package functional_interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Representa uma operação que não aceita argumento e retorna um resultado do tipo T.
 * Comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemplo {
    public static void main(String[] args) {
        // Fornecendo uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!"; // o supplier utiliza o método get para exercer sua função

        // Obtendo uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList()); // o generate gera uma lista de acordo com um supplier

        // Imprimindo
        listaSaudacoes.forEach(x -> System.out.println(x));

        // Outro exemplo
        Stream.generate(() -> "Olá, bem-vindo!").limit(5).collect(Collectors.toList()).forEach(System.out::println);
    }
}
