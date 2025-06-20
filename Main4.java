public class Main4 {
    public static void main(String[] args) {
        double initialValue = 10000;     // $10,000
        double growthRate = 0.07;        // 7% annual growth
        int years = 10;                  // Forecast for 10 years

        double futureValue = FinancialForecaster.calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("📈 Future value after %d years: $%.2f\n", years, futureValue);
    }
}