import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String titulo = "Criar conta no banco";

    System.out.println(titulo);
    System.out.println("-".repeat(titulo.length()));

    try {
      System.out.print("nome: ");
      String nomeCliente = scan.nextLine();

      System.out.print("agência: ");
      String numeroAgencia = scan.next();

      System.out.print("conta: ");
      int numeroConta = scan.nextInt();

      System.out.print("saldo: ");
      float saldo = scan.nextFloat();

      System.out.println(
          "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
      System.out.println("Sua agência é " + numeroAgencia + ", conta " +
          numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    } catch (Exception e) {
      System.out.println("Tipo de dado inválido!");
    }

    scan.close();
  }
}
