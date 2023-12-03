package E_Shope_DemoAutomation.utils.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log {
    public static final Logger logger = (Logger) LogManager.getLogger(Log.class);
public static void info(String info){
logger.info(info);
}

}

