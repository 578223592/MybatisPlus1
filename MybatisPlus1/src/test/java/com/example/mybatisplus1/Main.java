package com.example.mybatisplus1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nString = reader.readLine();
        int n = Integer.parseInt(nString);
        String line = reader.readLine();
        String[] s = line.split(" ");
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        //读入数组完毕，其中n表示整数n，ints数组表示第二行读入的数组
        for (int i = 0; i < n; i++) {
            int anInt = ints[i];
            int flag = 0;
            while (anInt != 0) {
                flag += anInt % 2;
                anInt >>= 1;
            }
            System.out.print(flag+" ");

        }
    }
}