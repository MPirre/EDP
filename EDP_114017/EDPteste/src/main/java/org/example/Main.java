import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma palavra (ou 'sair' para sair): ");
            String palavra = scanner.nextLine();

            if (palavra.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            boolean resultado = isPalindromo(palavra);
            System.out.println("É palíndromo? " + resultado);
        }

        scanner.close();
    }

    public static boolean isPalindromo(String palavra) {
        // Remover espaços em branco e converter para minúsculas
        String palavraTratada = palavra.replaceAll("\\s", "").toLowerCase();
        // Iniciar a verificação com índices iniciais
        return isPalindromoRecursivo(palavraTratada, 0, palavraTratada.length() - 1);
    }

    private static boolean isPalindromoRecursivo(String palavra, int inicio, int fim) {
        // Caso base: quando a verificação atinge o meio da palavra
        if (inicio >= fim) {
            return true;
        }
        // Verificar se os caracteres nos índices dados são iguais
        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }
        // Chamada recursiva para verificar os caracteres restantes
        return isPalindromoRecursivo(palavra, inicio + 1, fim - 1);
    }
}
