package com.collection.practice;

public class CharacterCount {
    public static String generateCharacterCount(String input) {
        StringBuilder output = new StringBuilder();
        
        if (input != null && !input.isEmpty()) {
            char currentChar = input.charAt(0);
            int count = 1;

            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == currentChar) {
                    count++;
                } else {
                    output.append(currentChar).append(count);
                    currentChar = input.charAt(i);
                    count = 1;
                }
            }

            output.append(currentChar).append(count);
        }
        
        return output.toString();
    }

    public static void main(String[] args) {
        String input = "aaafffaawq";
        String output = generateCharacterCount(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

