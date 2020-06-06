import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLogger {
    private static Logger LOG = Logger.getLogger(CustomLogger.class);

    public static void main(String[] args) {
        logWithDom();

    }

    public static void logWithDom(){
        DOMConfigurator.configure("LoggerInfo.xml");
        /*LOG.debug("DEBUG Logger message");
        LOG.info("INFO Logger message");
        LOG.warn("WARN Logger message");

        LOG.error("ERROR Logger message in you project");*/
        LOG.trace("TRACE message");
        LOG.debug("DEBUG message");
        LOG.info("INFO message");
        LOG.warn("WARN message");
        LOG.error("ERROR message");
        LOG.fatal("FATAL message");
    }
}
