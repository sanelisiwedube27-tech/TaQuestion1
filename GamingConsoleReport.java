public class GamingConsoleReport {
    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};

        System.out.println("----------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------");

        System.out.println("\t" + consoles[0]   + "\t" + consoles[1] + "\t" + consoles[2] + "\t");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(cities[i] + "\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------");
        System.out.println("\tCAPE TOWN\tPORT ELIZABETH\tPRETORIA");

        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            System.out.println("CITY WITH THE MOST SALES: " + cities);
            System.out.println(cities[i] + "Total:" + total);

        }
    }
}