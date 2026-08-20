import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] receberElementos(Scanner sc) {
        System.out.print("Digite a quantiade de elementos: ");
        int elementosQuantidade = sc.nextInt();

        int[] elementos = new int[elementosQuantidade];

        for (int i = 0; i < elementosQuantidade; i++) {
            System.out.printf("Digite o elemento %d: ", i + 1);
            elementos[i] = sc.nextInt();
        }

        return elementos;
    }

    public static int[] unirVetores(int[] vetorX, int[] vetorY) {
        int[] vetorMaior, vetorMenor;

        if (vetorX.length > vetorY.length) {
            vetorMaior = vetorX;
            vetorMenor = vetorY;
        } else {
            vetorMaior = vetorY;
            vetorMenor = vetorX;
        }

        int[] vetorZ = new int[vetorMenor.length];

        int vetorZIndice = 0;

        for (int i = 0; i < vetorMenor.length; i++) {
            boolean elementoRepetido = false;

            for (int j = 0; j < vetorMaior.length; j++) {
                if (vetorMenor[i] == vetorMaior[j]) {
                    for (int k = 0; k < vetorZ.length; k++) {
                        if (vetorMenor[i] == vetorZ[k]) {
                            elementoRepetido = true;
                            break;
                        }
                    }

                    if (!elementoRepetido) vetorZ[vetorZIndice] = vetorMenor[i];
                    vetorZIndice++;
                }

                elementoRepetido = false;
            }
        }

        return vetorZ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor X:");
        int[] vetorX = receberElementos(sc);

        System.out.println("Vetor Y:");
        int[] vetorY = receberElementos(sc);

        int[] vetorZ = unirVetores(vetorX, vetorY);

        System.out.printf(
                "Vetor união de X e Y: %s",
                Arrays.toString(vetorZ)
        );
    }
}
