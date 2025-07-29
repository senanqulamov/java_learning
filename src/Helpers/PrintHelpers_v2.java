package Helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

import Helpers.Colors.AnsiColor;


public class PrintHelpers_v2 {

    // ----------------- Constants ----------------- //
    private static boolean debugMode = true;
    private static final int ANIMATION_DURATION_MS = 3000;
    private static final int DOT_INTERVAL_MS = 250;



    // ----------------- Main Public Methods ----------------- //
    public static void printTitle(String title) {
        System.out.println(AnsiColor.CYAN + "\n==== " + title.toUpperCase() + " ====" + AnsiColor.RESET);
    }

    public static void printSection(String section) {
        System.out.println("\n" + AnsiColor.CYAN + "---- " + section + " ----" + AnsiColor.RESET);
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println(AnsiColor.GRAY + "-------------------------[Senan Qulamov ©2025]-------------------------" + AnsiColor.RESET);
    }

    public static void enableDebug() {
        debugMode = true;
    }

    public static void disableDebug() {
        debugMode = false;
    }

    // ----------------- Loading Animation Method ----------------- //
    private static void animateDots(String label) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + ANIMATION_DURATION_MS;
        int dotCount = 0;

        while (System.currentTimeMillis() < endTime) {
            long currentTime = System.currentTimeMillis();
            int elapsedSeconds = (int) ((currentTime - startTime) / 1000);
            int totalEstimated = (int) (ANIMATION_DURATION_MS / 1000);

            String dots = ".".repeat(dotCount % 4);
            String line = String.format(
                    "\r[%s] (%ds / ~%ds) %s   ",
                    label,
                    elapsedSeconds,
                    totalEstimated,
                    dots
            );

            System.out.print(AnsiColor.YELLOW + line + AnsiColor.RESET);
            System.out.flush();

            try {
                Thread.sleep(DOT_INTERVAL_MS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            dotCount++;
        }

        int totalSeconds = (int) ((System.currentTimeMillis() - startTime) / 1000);

        String finalLine = String.format("\r[Success] (%ds) \n", totalSeconds);
        System.out.print(finalLine);
    }



    // ----------------- Base Methods ----------------- //
    private static String timestamp() {
        return "[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "]";
    }

    private static void log(String label, AnsiColor color, String message) {
        System.out.println(color + message + " [" + label + "]" + timestamp() + AnsiColor.RESET);
    }

    private static void log_same_line(String label, AnsiColor color, String message) {
        System.out.print(color + message + " [" + label + "] " + timestamp() + AnsiColor.RESET);
    }



    // ----------------- Main Public Methods ----------------- //
    public static void print(String message) {
        System.out.println(message);
    }

    public static void printInfo(String message) {
        log("INFO", AnsiColor.BLUE, message);
    }

    public static void printWarning(String message) {
        log("WARNING", AnsiColor.YELLOW, message);
    }

    public static void printSuccess(String message) {
        log("SUCCESS", AnsiColor.GREEN, message);
    }

    public static void printError(String message) {
        log("ERROR", AnsiColor.RED, message);
    }

    public static void printDebug(String message) {
        if (debugMode) {
            log("DEBUG", AnsiColor.GRAY, message);
        }
    }

    public static void printFormatted(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }

    public static void printFormattedInfo(String format, Object... args) {
        log("INFO", AnsiColor.BLUE, String.format(format, args));
    }

    public static void printFormattedWarning(String format, Object... args) {
        log("WARNING", AnsiColor.YELLOW, String.format(format, args));
    }

    public static void printFormattedSuccess(String format, Object... args) {
        log("SUCCESS", AnsiColor.GREEN, String.format(format, args));
    }

    public static void printFormattedError(String format, Object... args) {
        log("ERROR", AnsiColor.RED, String.format(format, args));
    }

    public static void printFormattedDebug(String format, Object... args) {
        if (debugMode) {
            log("DEBUG", AnsiColor.GRAY, String.format(format, args));
        }
    }

    public static void print_same_line(String message) {
        System.out.print(message);
    }

    public static void printInfo_same_line(String message) {
        log_same_line("INFO", AnsiColor.BLUE, message);
    }

    public static void printWarning_same_line(String message) {
        log_same_line("WARNING", AnsiColor.YELLOW, message);
    }

    public static void printSuccess_same_line(String message) {
        log_same_line("SUCCESS", AnsiColor.GREEN, message);
    }

    public static void printError_same_line(String message) {
        log_same_line("ERROR", AnsiColor.RED, message);
    }

    public static void printDebug_same_line(String message) {
        if (debugMode) {
            log_same_line("DEBUG", AnsiColor.GRAY, message);
        }
    }

    public static void printFormatted_same_line(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }

    public static void printFormattedInfo_same_line(String format, Object... args) {
        log_same_line("INFO", AnsiColor.BLUE, String.format(format, args));
    }

    public static void printFormattedWarning_same_line(String format, Object... args) {
        log_same_line("WARNING", AnsiColor.YELLOW, String.format(format, args));
    }

    public static void printFormattedSuccess_same_line(String format, Object... args) {
        log_same_line("SUCCESS", AnsiColor.GREEN, String.format(format, args));
    }

    public static void printFormattedError_same_line(String format, Object... args) {
        log_same_line("ERROR", AnsiColor.RED, String.format(format, args));
    }

    public static void printFormattedDebug_same_line(String format, Object... args) {
        if (debugMode) {
            log_same_line("DEBUG", AnsiColor.GRAY, String.format(format, args));
        }
    }

    public static void clear_console() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printLoading(String message) {
        System.out.print(message);
        animateDots(message);
    }
}
