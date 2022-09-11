package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Numeric variables
        byte num1 = 1;
        short num2 = 15;
        int num3 = 55;
        long num4 = 1234567890;

        float dec1 = 15.65f;
        double dec2 = 12547.99d;

        // Boolean variables
        boolean bool1 = true;
        boolean bool2 = false;

        // text variables
        char txt1 = 'f';
        String txt2 = "Hello World";

        // arrays
        int[] numbers = new int[5]; // array initialized lengh
        numbers[0] = 45;
        numbers[1] = 45;
        numbers[2] = 45;
        numbers[3] = 45;
        numbers[4] = 45;
        String[] words = {"Hello", "World", "Friends"};

        // Lists
        List<Long> longValues = new ArrayList<>();
        longValues.add(123658L);
        longValues.add(12L);
        List<String> textList = new ArrayList<>();
        textList.add("Hello");

        // Maps
        Map<Integer, String> map = new HashMap();
        map.put(0, "Map 1");
        map.put(1, "Map 2");
        map.put(2, "Map 3");
    }
}
