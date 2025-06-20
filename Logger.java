public class Logger {
    // Step 1: Create a private static instance of the class
    private static Logger singleInstance;

    // Step 2: Make the constructor private so it cannot be instantiated externally
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger(); // lazy initialization
        }
        return singleInstance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
