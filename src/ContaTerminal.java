import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Utils.printDivider();
    Utils.printTitle("Criar conta no banco");

    try {
      System.out.print("nome: ");
      String clientName = scan.nextLine();

      System.out.print("agência: ");
      String agencyNumber = scan.next();

      System.out.print("conta: ");
      int accountNumber = scan.nextInt();

      System.out.print("saldo: ");
      float balance = scan.nextFloat();

      printAccountData(clientName, agencyNumber, accountNumber, balance);

    } catch (Exception e) {
      System.out.println("Tipo de dado inválido!");
    }

    scan.close();
  }

  public static void printAccountData(String clientName, String agencyNumber, int accountNumber, float balance) {
    Utils.printDivider();
    Utils.printTitle("Conta criada com sucesso!");

    System.out.println(" Nome    | " + clientName);
    System.out.println(" Agência | " + agencyNumber);
    System.out.println(" Conta   | " + accountNumber);
    System.out.println(" Saldo   | R$ " + balance);

    Utils.printDivider();
  }
}
