package ku.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CURRENT {

    Logger logger = LoggerFactory.getLogger(CURRENT.class);

    public void method() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
    }
}
