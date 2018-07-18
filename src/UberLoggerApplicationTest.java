import com.uber.logger.models.*;

public class UberLoggerApplicationTest {
    public static void main(String[] args) {
        OutputWriter outputWriter = new ConsoleWriter();
        Logger uberlogger = UberLogger.getInstance(outputWriter, LoggerLevel.DEBUG);
        uberlogger.info("Uber is awsome!!!!");
        uberlogger.error("Lets Rock!!!");
        uberlogger.debug("Yo Buddy..");
   }
}
