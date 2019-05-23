# LogTesting
Small project for exploring how to unit-test log messages.

tldr:
**Use class ListAppender provided by Logback.**
See FooTest.java


## my requirements / expectations
- no modifications to production code
- no extra libs or additional test/mock frameworks
- no config via file (logback-test.xml)
- limited modifications to main/test scope in maven/pom.xml
- test code simple and readable

## websites considered / recommend reads
- google "slf4j test logging"
- https://stackoverflow.com/questions/29076981/how-to-intercept-slf4j-with-logback-logging-via-a-junit-test
- https://stackoverflow.com/questions/4650222/what-is-the-best-way-to-unit-test-slf4j-log-messages

## how to use this project
- clone / import into your favorite IDE
- inspect / compare the 2 approaches in modules "logback" and "slf4jtest" 

## optional notes
- when using latest Hamcrest lib with JUnit4, read "Upgrading from Hamcrest 1.x" at http://hamcrest.org/JavaHamcrest/distributables
