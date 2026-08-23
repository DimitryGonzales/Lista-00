import java.util.Scanner;

public class Main {
    public static int[] receberMatriculas(Scanner sc) {
        System.out.print("\tDigite a quantidade de matriculas: ");
        int quantidade = sc.nextInt();

        int[] matriculas = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\tMatrícula %d: ", i + 1);
            matriculas[i] = sc.nextInt();
        }

        return matriculas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programação Modular: ");
        int[] matriculasProgMod = receberMatriculas(sc);

        System.out.println("\nCálculo: ");
        int[] matriculasCalculo = receberMatriculas(sc);

        System.out.print("\nMatriculas presentes em ambas as disciplinas: ");
        for (int matriculaProgMod : matriculasProgMod) {
            for (int matriculaCalculo : matriculasCalculo) {
                if (matriculaProgMod == matriculaCalculo)
                    System.out.printf("%d ", matriculaCalculo);
            }
        }
    }
}
