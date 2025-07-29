package Helpers;

public class Colors {
    // ----------------- ANSI colors ----------------- //
    public enum AnsiColor {
        RESET("\u001B[0m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        CYAN("\u001B[36m"),
        GRAY("\u001B[90m");

        private final String code;

        AnsiColor(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return code;
        }
    }
}
