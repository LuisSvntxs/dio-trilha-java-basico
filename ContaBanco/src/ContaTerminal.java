import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scan.nextLine(); 

        System.out.println("Informe a agência: ");
        String agencia = scan.nextLine(); 

        System.out.println("Informe o número da conta: ");
        int numero = scan.nextInt(); 

        System.out.println("Informe o seu saldo: ");
        Double saldo = scan.nextDouble(); 

        System.out.println();
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo R$"+ saldo +" já está disponível para saque");

         scan.close();
    }
}
