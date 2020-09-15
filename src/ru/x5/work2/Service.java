package ru.x5.work2;

import java.util.Scanner;

public class Service {
    public static int scan() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.close();
        return i;
    }
}
