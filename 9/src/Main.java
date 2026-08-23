import java.util.Scanner;

public class Main {
    public static int[] encontrarParesPosicoes(int[] numeros) {
        int paresQuantidade = 0;

        for (int numero : numeros) if (numero % 2 == 0) paresQuantidade++;

        int[] paresPosicoes = new int[paresQuantidade];

        int paresPosicoesIteracao = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                paresPosicoes[paresPosicoesIteracao] = i;
                paresPosicoesIteracao++;
            }
        }

        return paresPosicoes;
    }

    public static int[] encontrarImparesPosicoes(int[] numeros) {
        int imparesQuantidade = 0;

        for (int numero : numeros) if (numero % 2 != 0) imparesQuantidade++;

        int[] imparesPosicoes = new int[imparesQuantidade];

        int imparesPosicoesIteracao = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                imparesPosicoes[imparesPosicoesIteracao] = i;
                imparesPosicoesIteracao++;
            }
        }

        return imparesPosicoes;
    }

    public static StringBuilder gerarRelatorioPares(int[] numeros, int[] paresPosicoes) {
        StringBuilder relatorioPares = new StringBuilder();
        relatorioPares.append("Números pares:\n");

        int paresSoma = 0;

        for (int paresPosicao : paresPosicoes) {
            relatorioPares.append("\tnúmero ").append(numeros[paresPosicao]).append(" na posição ").append(paresPosicao).append("\n");

            paresSoma += numeros[paresPosicao];
        }

        relatorioPares.append("\tSoma dos pares = ").append(paresSoma);

        return relatorioPares;
    }

    public static StringBuilder gerarRelatorioImpares(int[] numeros, int[] imparesPosicoes) {
        StringBuilder relatorioImpares = new StringBuilder();
        relatorioImpares.append("Números ímpares:\n");

        for (int imparesPosicao : imparesPosicoes) {
            relatorioImpares.append("\tnúmero ").append(numeros[imparesPosicao]).append(" na posição ").append(imparesPosicao).append("\n");
        }

        relatorioImpares.append("\tQuantidade de ímpares = ").append(imparesPosicoes.length);

        return relatorioImpares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        var paresPosicoes = encontrarParesPosicoes(numeros);
        var imparesPosicoes = encontrarImparesPosicoes(numeros);

        var paresRelatorio = gerarRelatorioPares(numeros, paresPosicoes);
        var imparesRelatorio = gerarRelatorioImpares(numeros, imparesPosicoes);

        System.out.printf("\n%s\n\n%s", paresRelatorio, imparesRelatorio);
    }
}
