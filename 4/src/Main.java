import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] receberElementos(Scanner sc) {
        System.out.print("\tDigite a quantiade de elementos: ");
        int elementosQuantidade = sc.nextInt();

        String[] elementos = new String[elementosQuantidade];

        for (int i = 0; i < elementosQuantidade; i++) {
            System.out.printf("\tElemento %d: ", i + 1);
            elementos[i] = sc.next();
        }

        return elementos;
    }

    public static boolean estaIncluido(String elemento, String[] elementos) {
        boolean incluido = false;

        for (String elementoAtual : elementos) {
            if (elemento.equals(elementoAtual)) {
                incluido = true;
                break;
            }
        }

        return incluido;
    }

    public static String[] unirVetores(String[] vetorX, String[] vetorY) {
        String[] uniao = new String[vetorX.length + vetorY.length];

        int uniaoIndice = 0;

        for (String elemento : vetorX) {
            if (!estaIncluido(elemento, uniao)) {
                uniao[uniaoIndice] = elemento;
                uniaoIndice++;
            }
        }

        for (String elemento : vetorY) {
            if (!estaIncluido(elemento, uniao)) {
                uniao[uniaoIndice] = elemento;
                uniaoIndice++;
            }
        }

        int uniaoValidos = 0;

        for (String elemento : uniao) if (elemento != null) uniaoValidos++;

        String[] vetorZ = new String[uniaoValidos];

        for (int i = 0; i < vetorZ.length; i++) vetorZ[i] = uniao[i];

        return vetorZ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor X:");
        String[] vetorX = receberElementos(sc);

        System.out.println("\nVetor Y:");
        String[] vetorY = receberElementos(sc);

        String[] vetorZ = unirVetores(vetorX, vetorY);

        System.out.printf("\nUnião dos vetores X e Y: %s", Arrays.toString(vetorZ));
    }
}
