package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R
 * Transforma ou mapeia os elementos do Stream em outros valores ou tipos
 */

public class FunctionExemplo {
    public static void main(String[] args) {
        // Criando uma lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Function com expressão lambda para triplicar todos os números
        Function<Integer, Integer> triplicar = numero -> numero * 3; // o function possui o método apply para exercer sua função

        // Função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosTriplicados = numeros.stream().map(triplicar).toList(); // o map recebe uma Function como argumento

        numerosTriplicados.forEach(n -> System.out.println(n));

        // outro exemplo
        numeros.stream().map(numero -> numero * 2).toList().forEach(System.out::println);
    }
}
