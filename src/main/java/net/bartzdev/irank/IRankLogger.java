package net.bartzdev.irank;

import java.io.PrintStream;
import java.util.logging.Logger;

public class IRankLogger {

    private static final PrintStream PRINT_STREAM = System.out;

    public static void log(Level level, String log) {
        PRINT_STREAM.println(level.getPrefix() + log);
    }

    public static void info(String log) {
        PRINT_STREAM.println(Level.INFO.getPrefix() + log);
    }

    public static void severe(String log) {
        PRINT_STREAM.println(Level.SEVERE.getPrefix() + log);
    }

    public static void warning(String log) {
        PRINT_STREAM.println(Level.WARNING.getPrefix() + log);
    }
}
enum Level {
    INFO("[INFO] "),
    SEVERE("[SEVERE] "),
    WARNING("[WARNING] ");

    private String prefix;

    Level(String s) {
        this.prefix = s;
    }

    public String getPrefix() {
        return this.prefix;
    }
}
