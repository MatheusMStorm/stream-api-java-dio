package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream
 * sem modificar ou retornar um valor.
 */

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Consumer para impressão de números ímpares
        Consumer<Integer> imprimirImpares = numero -> { // o Consumer possui o accept() dentro dele, que faz essa função
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirImpares);

        // Consumer para impressão de números pares
        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
