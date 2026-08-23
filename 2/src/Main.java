import java.util.Scanner;

public class Main {
    public static int encontrarMaiorValor(int[] valores) {
        int valorMenor = valores[0];

        for (int i = 1; i < valores.length; i++)
            if (valores[i] > valorMenor) valorMenor = valores[i];

        return valorMenor;
    }

    public static int encontrarMenorValor(int[] valores) {
        int valorMenor = valores[0];

        for (int i = 1; i < valores.length; i++)
            if (valores[i] < valorMenor) valorMenor = valores[i];

        return valorMenor;
    }

    public static boolean estaDentroIntervalo(int valor, int inicio, int fim) {
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        return valor >= inicio && valor <= fim;
    }

    public static boolean ehDivisivel(int dividendo, int divisor) { return dividendo % divisor == 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.print("Digite 3 valores inteiros(x, y, z): ");
        valores[0] = sc.nextInt();
        valores[1] = sc.nextInt();
        valores[2] = sc.nextInt();

        System.out.printf(
                "\nMaior valor: %d\nMenor valor: %d\nO valor x(%d) está dentro do intervalo y, z(%d, %d)?: %b\nO valor x(%d) é divisível por y(%d)?: %b\nO valor x(%d) é divisível por z(%d)?: %b",
                encontrarMaiorValor(valores),
                encontrarMenorValor(valores),
                valores[0], valores[1], valores[2], estaDentroIntervalo(valores[0], valores[1], valores[2]),
                valores[0], valores[1], ehDivisivel(valores[0], valores[1]),
                valores[0], valores[2], ehDivisivel(valores[0], valores[2])
        );

        sc.close();
    }
}
