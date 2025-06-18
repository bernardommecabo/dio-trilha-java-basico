import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("\nDigite o número da agência da conta: ");
        String agenciaConta = input.next();
        System.out.print("\nDigite seu nome: ");
        String nomeConta = input.next();
        System.out.print("\nDigite o saldo da conta: ");
        double saldoConta = input.nextDouble();
        
        System.out.println("Olá "+nomeConta+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");
    }
}
