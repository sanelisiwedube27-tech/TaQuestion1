import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String consoleType;
        System.out.print("Enter the store:");
        String storeName = input.nextLine();
        System.out.print("Enter the total sales of PS5 consoles for Number 1 Electronic Store: ");
        int totalSales = input.nextInt();
        String consoleType;

        ConsoleSales consoleSales = new ConsoleSales(consoleType,storeName,totalSales);
        consoleSales.printConsoleSales();
    }
}