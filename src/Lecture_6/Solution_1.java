package Lecture_6;

public class Solution_1 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (IllegalArgumentException  e){
            System.out.println(e);
        }
    }
}
