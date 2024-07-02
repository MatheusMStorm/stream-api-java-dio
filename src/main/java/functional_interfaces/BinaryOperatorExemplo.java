package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/* 
 * Operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
 * Realiza operações de redução em pares de elementos, como soma ou combinação de objetos
*/

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Somando dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // O reduce é o parâmetro do stream que recebe o binary operator
        System.out.println(numeros.stream().reduce(0, somar)); // o outro parâmetro representado por 0 é uma variável de referência para a soma, a partir dela, nós somamos os números da lista

        // Outro exemplo simplificado
        // O Binary Operator utiliza o apply para exercer sua função
        int subtracao = numeros.stream().reduce(0, (num1, num2) -> num1 - num2);
        System.out.println(subtracao);
    }
}
