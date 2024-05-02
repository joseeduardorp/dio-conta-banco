public class Utils {
  public static void printTitle(String title) {
    System.out.println(title);
    printDivider("-", title.length());
  }

  public static void printDivider() {
    System.out.println("\n" + "=".repeat(50) + "\n");
  }

  public static void printDivider(String symbol) {
    System.out.println(symbol.repeat(50));
  }

  public static void printDivider(int length) {
    System.out.println("=".repeat(length));
  }

  public static void printDivider(String symbol, int length) {
    System.out.println(symbol.repeat(length));
  }
}
