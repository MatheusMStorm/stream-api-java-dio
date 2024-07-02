package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um boolean
 * Usada para filtrar os elementos do Stream com base em alguma condição
 */

public class PredicateExemplo {
    public static void main(String[] args) {
        // Criando uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "c", "go");

        // Verificando se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // O método filter do stream recebe um predicate como parâmetro

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

        // Exemplificando com o método dentro do argumento
        palavras.stream().filter(palavra -> palavra.length() < 5).forEach(System.out::println);
    }
}
