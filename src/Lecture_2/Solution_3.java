package Lecture_2;

public class Solution_3 {
    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getClassName() + ": " + stackTraceElement[2].getMethodName() + ": " + text);
    }
}
