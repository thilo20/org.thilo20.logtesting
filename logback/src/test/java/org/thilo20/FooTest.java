package org.thilo20;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Uses Logback.
 * see https://stackoverflow.com/questions/29076981/how-to-intercept-slf4j-with-logback-logging-via-a-junit-test
 */
public class FooTest {

    @Test
    public void doThat() {
        // get Logback Logger 
        Logger fooLogger = (Logger) LoggerFactory.getLogger(Foo.class);

        // create and start a ListAppender
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();

        // add the appender to the logger
        fooLogger.addAppender(listAppender);

        // call method under test
        Foo foo = new Foo();
        foo.doThat();

        // JUnit assertions
        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("start", logsList.get(0)
                                      .getMessage());
        assertEquals(Level.INFO, logsList.get(0)
                                         .getLevel());

        assertEquals("finish", logsList.get(1)
                                       .getMessage());
        assertEquals(Level.INFO, logsList.get(1)
                                         .getLevel());
    }
}