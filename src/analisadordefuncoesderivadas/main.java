package analisadordefuncoesderivadas;

import java.util.Scanner;

/**
 * Classe principal que inicia a aplicação.
 * @author Gabriel Fernandes
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a função matemática (ex: 3x^2 + 2x + 1): ");
        String input = scanner.nextLine();
        
        Function function = new Function(input);
        System.out.println("A derivada da função é: " + function.derivate());
    }
}
