package Lecture_6;

public class Solution_2 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException  e){
            System.out.println("NullPointerException");
        }
    }
}
