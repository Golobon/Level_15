package Lecture_2;
import java.lang.StackTraceElement;

public class Solution_2 {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
