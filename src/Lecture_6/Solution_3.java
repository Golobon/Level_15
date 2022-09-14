package Lecture_6;

import java.util.HashMap;

public class Solution_3 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
