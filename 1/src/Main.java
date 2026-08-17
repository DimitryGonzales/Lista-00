import java.util.Scanner;

public class Main {
    public static int fatorial(int valor) {
        return valor == 1 ? 1 : valor * fatorial(valor - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o seu fatorial: ");
        int valor = sc.nextInt();

        System.out.printf("Fatorial de %d = %d", valor, fatorial(valor));
    }
}
