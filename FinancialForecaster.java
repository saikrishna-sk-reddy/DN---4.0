public class FinancialForecaster {

    /**
     * Recursive method to calculate future value
     * @param initialValue Initial amount of money
     * @param growthRate Annual growth rate (e.g., 0.05 for 5%)
     * @param years Number of years to forecast
     * @return Future value after given years
     */
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return initialValue;
        }
        // Recursive case
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}