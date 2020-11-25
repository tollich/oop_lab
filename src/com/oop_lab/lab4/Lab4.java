package com.oop_lab.lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("\nReading one expression");
        System.out.println("src/1.txt");
        System.out.println("\nReading three expressions");
        System.out.println("src/com/oop_lab/lab4/3.txt");
    }

    public static void ReadFromFile(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while (true) {
            String s = reader.readLine();
            if (s == null) break;
            System.out.println("\nFound expression: " + s);
            System.out.println("Result: " + CheckBrackets(s));
        }
    }

    public static String CheckBrackets(String expression) throws Exception {
        if (expression.isEmpty())
            return "Check file, something went wrong";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char newCharacter = expression.charAt(i);
            if (newCharacter == '(' || newCharacter == '[' || newCharacter == '{') {
                stack.push(newCharacter);
            } else if (newCharacter == ')' || newCharacter == ']' || newCharacter == '}') {
                if (stack.isEmpty())
                    return "Not Correct";

                char lastAdded = stack.peek();

                if (newCharacter == ')' && lastAdded == '(' || newCharacter == ']' && lastAdded == '[' || newCharacter == '}' && lastAdded == '{')
                    stack.pop();
                else return "Not Correct";
            }
        }
        if (stack.isEmpty()) return "Correct";
        else return "Not Correct";
    }
}