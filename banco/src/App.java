import static java.lang.System.in;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        int numeroConta = 0;
        String agenciBancaria = "";
        String nomePessoa = "";
        double saldoConta = 0.0;

        Scanner scanner = new Scanner(in);

        System.out.println("Por favor, Informe o Nome do Cliente: ");
        nomePessoa = scanner.nextLine();

        System.out.println("Por favor, Digite o Número da Agência: ");
        agenciBancaria = scanner.nextLine();

        System.out.println("Por favor, Digite o Número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, Informe o Saldo da Conta: ");
        saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomePessoa + ", Obrigado por Criar uma Conta em Nosso Banco, sua Agência é " + agenciBancaria + ", Conta " + numeroConta + " e seu Saldo " + saldoConta + " Já está Disponível para Saque");

    }
}