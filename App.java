package com.example;
import java.io.*;
import java.util.*;

public class App {

    public static void main( String[] args ){}

    public String filename;
    public List<Integer> numbers;

    public App(String fileName) {
        this.filename = fileName;
        this.numbers = readNumbersFromFile(this.filename);
    }

    public static List<Integer> readNumbersFromFile(String fileName) {
        List<Integer> nums = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            for (String part : line.split(" ")) {
                nums.add(Integer.parseInt(part));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nums;
    }

    public long _min() {
        long min = Long.MAX_VALUE;
        for (int num : this.numbers) {
            if (num < min) min = num;
        }
        return min;
    }

    public long _max() {
        long max = Long.MIN_VALUE;
        for (int num : this.numbers) {
            if (num > max) max = num;
        }
        return max;
    }

    public long _sum() {
        long sum = 0;
        for (long num : this.numbers) {
            sum += num;
        }
        return sum;
    }

    public long _mult() {
        long mult = 1;
        for (long num : this.numbers) {
            mult *= num;
        }
        return mult;
    }
}