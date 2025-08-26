package CreationalDesignPattern.SingletonDesignPattern.WithPattern;

public class Logger {

    private static volatile Logger logger = null;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void Log() {
        System.out.println("Logging");
    }
}
