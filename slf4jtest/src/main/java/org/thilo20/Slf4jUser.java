package org.thilo20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * see http://projects.lidalia.org.uk/slf4j-test/index.html
 */
public class Slf4jUser {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jUser.class);

    public void aMethodThatLogs() {
        logger.info("Hello World!");
    }
}