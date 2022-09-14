package Lecture_6;

public class Solution_3 {
    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
