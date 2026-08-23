import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String mesNome(int mesNumero) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        return meses[mesNumero - 1];
    }

    public static StringBuilder gerarRelatorio(float[][] vendas) {
        StringBuilder relatorio = new StringBuilder();

        float totalLoja = 0;

        for (int i = 0; i < vendas.length; i++) {
            float totalMes = 0;

            relatorio.append("Total vendido em ").append(mesNome(i + 1)).append(":\n");

            for (int j = 0; j < vendas[i].length; j++) {
                relatorio.append("\tSemana ").append(j + 1).append(": R$").append(vendas[i][j]).append("\n");

                totalMes += vendas[i][j];
            }

            relatorio.append("\tTotal: R$").append(totalMes).append("\n");

            totalLoja += totalMes;
        }

        relatorio.append("Total vendido pela loja: R$").append(totalLoja);

        return relatorio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] vendas = new float[12][4];

        for (int i = 0; i < vendas.length; i++) {
            System.out.printf("Vendas de %s:\n", mesNome(i + 1));

            for (int j = 0; j < vendas[i].length; j++) {
                System.out.printf("\tSemana %d: R$", j + 1);
                vendas[i][j] = sc.nextFloat();
            }
        }

        var relatorio = gerarRelatorio(vendas);

        System.out.printf("\n%s", relatorio);
    }
}
