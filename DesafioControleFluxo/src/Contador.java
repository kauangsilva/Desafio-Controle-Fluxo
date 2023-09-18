import java.util.Scanner;

//Está sendo criado a classe da nossa exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {}
}

public class Contador {
    public static void main(String[] args) {
        // Recebendo os parâmetros e associando as variaveis ao scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
        
        try { // capturando a exceção e imprimindo a mensagem de erro correspondente
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
       
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        /*Verificando se o parâmetro 2 é maior ou igual que o 1, caso não for..
        será lançado a exceção personalizada.
        */
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else { // Caso contrário, imprimindo no contador for, a diferença do 1 até chegar ao 2.
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
    }
}
