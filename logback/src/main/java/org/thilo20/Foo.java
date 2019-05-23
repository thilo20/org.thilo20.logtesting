package org.thilo20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * see https://stackoverflow.com/questions/29076981/how-to-intercept-slf4j-with-logback-logging-via-a-junit-test
 */
public class Foo {

    private static final Logger LOGGER = LoggerFactory.getLogger(Foo.class);

    public void doThat() {
        LOGGER.info("start");
        //...
        LOGGER.info("finish");
    }
}