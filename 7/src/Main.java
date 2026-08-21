import java.util.Scanner;

public class Main {
    public static String mesNome(int mesNumero) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return meses[mesNumero - 1];
    }

    public static int[] gerarTemperaturas(Scanner sc) {
        int[] temperaturas = new int[12];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Digite a temperatura média de %s: ", mesNome(i + 1));
            temperaturas[i] = sc.nextInt();
        }

        return temperaturas;
    }

    public static int[] encontrarMaiorTemperatura(int[] temperaturas) {
        int[] temperaturaMaiorMes = {temperaturas[0], 1};

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaiorMes[0]) {
                temperaturaMaiorMes[0] = temperaturas[i];
                temperaturaMaiorMes[1] = i + 1;
            }
        }

        return temperaturaMaiorMes;
    }

    public static int[] encontrarMenorTemperatura(int[] temperaturas) {
        int[] temperaturaMenorMes = {temperaturas[0], 1};

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMenorMes[0]) {
                temperaturaMenorMes[0] = temperaturas[i];
                temperaturaMenorMes[1] = i + 1;
            }
        }

        return temperaturaMenorMes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temperaturas = gerarTemperaturas(sc);
        int[] temperaturaMaiorMes = encontrarMaiorTemperatura(temperaturas);
        int[] temperaturaMenorMes = encontrarMenorTemperatura(temperaturas);

        System.out.printf(
                "Maior temperatura: %d° - %s\nMenor temperatura: %d° - %s",
                temperaturaMaiorMes[0], mesNome(temperaturaMaiorMes[1]),
                temperaturaMenorMes[0], mesNome(temperaturaMenorMes[1])
        );
    }
}
