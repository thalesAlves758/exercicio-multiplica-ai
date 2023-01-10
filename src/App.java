import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número qualquer: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de multiplicação de X");

        for (int i = 1; i <= 10; i++) {
            System.out.format("%2s x %2s = %2s\n", i, numero, numero * i);
        }
    }
}
