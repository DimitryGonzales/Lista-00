import java.util.Scanner;

public class Main {
    public static StringBuilder gerarRelatorio(float[] valores, int[] vendidos) {
        StringBuilder relatorio = new StringBuilder();

        float valorGeral = 0;

        for (int i = 0; i < valores.length; i++) {
            float valorTotal = valores[i] * vendidos[i];

            relatorio.append("Objeto ").append(i + 1).append(":\n")
                    .append("\tValor Unitário: R$").append(valores[i]).append("\n")
                    .append("\tQuantidade vendida: ").append(vendidos[i]).append("\n")
                    .append("\tValor total: R$").append(valorTotal).append("\n");

            valorGeral += valorTotal;
        }

        float valorComissao = (valorGeral / 100) * 5;

        relatorio.append("\n")
                .append("Valor geral: R$").append(valorGeral).append("\n")
                .append("Valor da comissão: R$").append(valorComissao);

        return relatorio;
    }

    public static float encontrarMaisVendidoValor(float[]valores, int[] vendidos) {
        int maisVendido = vendidos[0];
        float maisVendidoValor = valores[0];

        for (int i = 1; i < vendidos.length; i++) {
            if (vendidos[i] > maisVendido) {
                maisVendido = vendidos[i];
                maisVendidoValor = valores[i];
            }
        }

        return maisVendidoValor;
    }

    public static int encontrarMaisVendidoPosicao(int[] vendidos) {
        int maisVendido = vendidos[0];
        int maisVendidoPosicao = 0;

        for (int i = 1; i < vendidos.length; i++) {
            if (vendidos[i] > maisVendido) {
                maisVendido = vendidos[i];
                maisVendidoPosicao = i;
            }
        }

        return maisVendidoPosicao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] valores = new float[10];
        int[] vendidos = new int[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor do objeto %d: R$", i + 1);
            valores[i] = sc.nextFloat();

            System.out.printf("Digite a quantidade vendida do objeto %d: ", i + 1);
            vendidos[i] = sc.nextInt();
        }

        var relatorio = gerarRelatorio(valores, vendidos);
        var maisVendidoValor = encontrarMaisVendidoValor(valores, vendidos);
        var maisVendidoPosicao = encontrarMaisVendidoPosicao(vendidos);
        System.out.printf(
                "%s\n\nValor do objeto mais vendido: R$%.2f\nPosição no vetor do objeto mais vendido: %d",
                relatorio,
                maisVendidoValor,
                maisVendidoPosicao

        );
    }
}
