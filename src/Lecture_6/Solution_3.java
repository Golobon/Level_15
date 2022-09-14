package Lecture_6;

public class Solution_3 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Before method1 calling.");
            int a = 1/0;
            System.out.println("After method1 calling. Never will be shown.");
        }
        catch (NullPointerException e)
        {
            System.out.println("Reference is null. Exception has been caught.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divided by zero. Exception has been caught.");
        }
        catch (Exception e)
        {
            System.out.println("Any other errors. Exception has been caught.");
        }

    }
}
