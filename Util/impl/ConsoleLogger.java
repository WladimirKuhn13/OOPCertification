package Certification.Util.impl;

import java.time.LocalDateTime;

import Certification.Util.Loggable;

public class ConsoleLogger implements Loggable {

    @Override
    public void logging(String log) {
        System.err.println(LocalDateTime.now() + " ============== " + log);
    }
}
