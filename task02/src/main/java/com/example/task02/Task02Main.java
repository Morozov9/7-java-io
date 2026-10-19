package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int current;

        while (prev != -1) {
            current = System.in.read();

            if (prev == 13 && current == 10) {
                // Пропускаем \r, оставляя \n в prev для следующей итерации
                prev = current;
            } else {
                System.out.write(prev);
                prev = current;
            }
        }

        System.out.flush();
    }
}
