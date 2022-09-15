package Lecture_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

public class Solution_3 {
    public static void main(String[] args) {
        handleExceptions(new Solution_3());

    }

    public static void handleExceptions(Solution_3 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (RemoteException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
