public class Main {
    public static void main(String[] args) {
        CalculateOfFuel calculateOfFuel = new CalculateOfFuel();
        double countExpense=2.0;
        double countGasTank=100.0;
        double distanse=calculateOfFuel.calc(countExpense,countGasTank);
        String formattedDistanse = String.format("%.1f", distanse);
        System.out.println("Топлива хватит на "+ formattedDistanse+ " км");
        System.out.println("");
    }
}
