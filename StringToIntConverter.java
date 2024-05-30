package com.example.demo;

public class StringToIntConverter {

    public static void main(String[] args) {
        String input = "$180,240/y";
        int output = convertStringToInt(input);

        System.out.println("Output of converted Integer :: " + output);
    }

    private static int convertStringToInt(String input) {
        int out = Integer.parseInt(input.replaceAll("[^0-9]",""));
        return out;
    }
}
