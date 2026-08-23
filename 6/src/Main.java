import java.util.Scanner;

public class Main {
    public static int[][] gerarAlunos(int[] gabarito, Scanner sc) {
        int[][] alunos = new int[10][2];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Número do aluno %d: ", i + 1);
            alunos[i][0] = sc.nextInt();

            for (int j = 0; j < gabarito.length; j++) {
                System.out.printf("\tResposta do aluno para a questão %d: ", j + 1);
                int resposta = sc.nextInt();

                if (resposta == gabarito[j]) alunos[i][1]++;
            }
        }

        return alunos;
    }

    public static float calcularAprovacao(int[][] alunos) {
        int aprovados = 0;

        for (int[] aluno : alunos) if (aluno[1] >= 6) aprovados++;

        return ((float) aprovados / alunos.length) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] gabarito = new int[8];

        System.out.println("Gabarito das questões:");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("\tQuestão %d: ", i + 1);
            gabarito[i] = sc.nextInt();
        }

        var alunos = gerarAlunos(gabarito, sc);

        var aprovacaoPorcentagem = calcularAprovacao(alunos);

        for (int[] aluno : alunos) System.out.printf("Nota do aluno %d: %d\n", aluno[0], aluno[1]);

        System.out.printf("\nPorcentagem de aprovação: %.2f%%", aprovacaoPorcentagem);
    }
}
