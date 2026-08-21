import java.util.Scanner;

public class Main {
    public static int[] gerarGabarito(Scanner sc) {
        int [] gabarito = new int[8];

        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Gabarito da questão %d: ", i + 1);
            gabarito[i] = sc.nextInt();
        }

        return gabarito;
    }

    public static int[][] gerarAlunos(int[] gabarito, Scanner sc) {
        int[][] alunos = new int[10][2];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o número do aluno %d: ", i + 1);
            alunos[i][0] = sc.nextInt();

            for (int j = 0; j < gabarito.length; j++) {
                System.out.printf("Digite a resposta do aluno para a questão %d: ", j + 1);
                int resposta = sc.nextInt();

                if (resposta == gabarito[j]) alunos[i][1]++;
            }
        }

        return alunos;
    }

    public static float calcularAprovacao(int[][] alunos) {
        int aprovados = 0;

        for (int i = 0; i < alunos.length; i++) if (alunos[i][1] >= 6) aprovados++;

        return ((float) aprovados / alunos.length) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] gabarito = gerarGabarito(sc);
        int[][] alunos = gerarAlunos(gabarito, sc);
        float aprovacaoPorcentagem = calcularAprovacao(alunos);

        for (int i = 0; i < alunos.length; i++) System.out.printf("Aluno %d: %d\n", alunos[i][0], alunos[i][1]);
        System.out.printf("Porcentagem de aprovação: %.2f%%", aprovacaoPorcentagem);
    }
}
