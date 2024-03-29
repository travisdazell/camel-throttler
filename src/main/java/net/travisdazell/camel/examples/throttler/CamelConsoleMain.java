package net.travisdazell.camel.examples.throttler;

import org.apache.camel.spring.Main;

public final class CamelConsoleMain {

    private CamelConsoleMain() {
    }

    public static void main(String[] args) throws Exception {
        // Main makes it easier to run a Spring application
        Main main = new Main();
        // configure the location of the Spring XML file
        main.setApplicationContextUri("META-INF/spring/camel-context.xml");
        // enable hangup support allows Camel to detect when the JVM is terminated
        main.enableHangupSupport();
        // run and block until Camel is stopped (or JVM terminated)
        main.run();
    }
}
