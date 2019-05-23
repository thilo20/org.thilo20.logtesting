package org.thilo20;

import org.junit.After;
import org.junit.Test;

import uk.org.lidalia.slf4jtest.LoggingEvent;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;

// import static java.util.Arrays.asList;
// import static org.hamcrest.Matchers.is;
import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static uk.org.lidalia.slf4jtest.LoggingEvent.info;

/**
 * Uses slf4j-test.
 * see http://projects.lidalia.org.uk/slf4j-test/index.html
 */
public class Slf4jUserTest {

    Slf4jUser slf4jUser = new Slf4jUser();
    TestLogger logger = TestLoggerFactory.getTestLogger(Slf4jUser.class);

    @Test
    public void aMethodThatLogsLogsAsExpected() {
        slf4jUser.aMethodThatLogs();

        // assert single LoggingEvent
        assertEquals(logger.getLoggingEvents().get(0), info("Hello World!"));

        // assert list of LoggingEvent
        assertEquals(logger.getLoggingEvents(), asList(info("Hello World!")));

        // assert list of LoggingEvent
        // using hamcrest "is" matcher, requires dependency org.hamcrest
        assertThat(logger.getLoggingEvents(), is(asList(info("Hello World!"))));

        // assert array of LoggingEvent
        LoggingEvent[] expected = new LoggingEvent[1];
        expected[0] = info("Hello World!");
        assertArrayEquals(logger.getLoggingEvents().toArray(), expected);
    }

    @After
    public void clearLoggers() {
        TestLoggerFactory.clear();
    }
}