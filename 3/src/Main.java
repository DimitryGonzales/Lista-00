import java.util.Scanner;

public class Main {
    public static int[] receberMatriculas(Scanner sc) {
        System.out.print("Digite a quantidade de matriculas: ");
        int quantidade = sc.nextInt();

        int[] matriculas = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o número da matrícula %d: ", i + 1);
            matriculas[i] = sc.nextInt();
        }

        return matriculas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programação Modular: ");
        int[] matriculasProgMod = receberMatriculas(sc);

        System.out.println("Cálculo: ");
        int[] matriculasCalculo = receberMatriculas(sc);

        int[] vetorMaior, vetorMenor;

        if (matriculasProgMod.length > matriculasCalculo.length) {
            vetorMaior = matriculasProgMod;
            vetorMenor = matriculasCalculo;
        } else {
            vetorMaior = matriculasCalculo;
            vetorMenor = matriculasProgMod;
        }

        for (int i = 0; i < vetorMaior.length;i++) {
            for (int j = 0; j < vetorMenor.length; j++) {
                if (vetorMaior[i] == vetorMenor[j])
                    System.out.printf("A matricula %d está presente nas duas disciplinas\n", vetorMaior[i]);
            }
        }
    }
}
