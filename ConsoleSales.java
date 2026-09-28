public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }
    public  void printConsoleSales() {
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStoreName());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
    }

