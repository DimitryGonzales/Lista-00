import java.util.Scanner;

public class Main {
    public static int receberOpcao(String opcoes, int opcoesQuantidade, Scanner sc) {
        System.out.printf("%s\n> ", opcoes);
        int opcao = sc.nextInt();

        while (opcao < 1 || opcao > opcoesQuantidade) {
            System.out.println("Opção inválida!");

            System.out.printf("%s\n> ", opcoes);
            opcao = sc.nextInt();
        }

        return opcao;
    }

    public static int receberIdade(Scanner sc) {
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        while (idade < -1) {
            System.out.println("A idade não pode ser um valor negativo!");

            System.out.print("Idade: ");
            idade = sc.nextInt();
        }

        return idade;
    }

    public static boolean ehIndividuoValido(int sexo, int idade, int corDosOlhos, int corDosCabelos) {
        return sexo == 2 && idade >= 18 && idade <= 35 && corDosOlhos == 2 && corDosCabelos == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var idade = receberIdade(sc);

        int maiorIdade = idade, menorIdade = idade, individuosValidos = 0;

        while (idade != -1) {
            if (idade > maiorIdade) maiorIdade = idade;
            else if (idade < menorIdade) menorIdade = idade;

            int sexo = receberOpcao("Sexo:\n1) Masculino\n2) Feminino", 2, sc),
                    corDosOlhos = receberOpcao("Cor dos olhos:\n1) Azuis\n2) Verdes\n3) Castanhos", 3, sc),
                    corDosCabelos = receberOpcao("Cor dos cabelos:\n1) Louros\n2) Castanhos\n3) Pretos", 3, sc);

            if (ehIndividuoValido(sexo, idade, corDosOlhos, corDosCabelos)) individuosValidos++;

            idade = receberIdade(sc);
        }

        System.out.printf(
                "\nMaior idade: %d\nMenor idade: %d\nQuantidade de indivíduos válidos: %d",
                maiorIdade,
                menorIdade,
                individuosValidos
        );
    }
}
