import java.util.Scanner;

public class Main {
    public static int encontrarValorMaior(int[] valores) {
        int valorMenor = valores[0];

        for (int i = 1; i < valores.length; i++)
            if (valores[i] > valorMenor) valorMenor = valores[i];

        return valorMenor;
    }

    public static int encontrarValorMenor(int[] valores) {
        int valorMenor = valores[0];

        for (int i = 1; i < valores.length; i++)
            if (valores[i] < valorMenor) valorMenor = valores[i];

        return valorMenor;
    }

    public static boolean xDentroIntervaloYZ(int[] valores) {
        int intervaloYZMenor, intervaloYZMaior;

        if (valores[1] < valores[2]) {
            intervaloYZMenor = valores[1];
            intervaloYZMaior = valores[2];
        } else {
            intervaloYZMenor = valores[2];
            intervaloYZMaior = valores[1];
        }

        return valores[0] >= intervaloYZMenor && valores[0] <= intervaloYZMaior;
    }

    public static boolean xDivisivelY(int[] valores) {
        return valores[0] % valores[1] == 0;
    }

    public static boolean xDivisivelZ(int[] valores) {
        return valores[0] % valores[2] == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.print("Digite 3 valores inteiros(x, y, z): ");
            valores[0] = sc.nextInt();
            valores[1] = sc.nextInt();
            valores[2] = sc.nextInt();

        System.out.printf(
                "Maior valor: %d\nMenor valor: %d\nO valor x está dentro do intervalo (y, z)?: %b\nO valor x é divisível por y?: %b\nO valor x é divisível por z?: %b",
                encontrarValorMaior(valores),
                encontrarValorMenor(valores),
                xDentroIntervaloYZ(valores),
                xDivisivelY(valores),
                xDivisivelZ(valores)
        );

        sc.close();
    }
}
