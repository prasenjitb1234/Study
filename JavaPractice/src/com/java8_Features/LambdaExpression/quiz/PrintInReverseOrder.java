package com.java8_Features.LambdaExpression.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintInReverseOrder {
    public static void main(String[] args) {
    	
//		Q. Given a list of strings, print each in reverse order.

        List<String> words = Arrays.asList("java", "code", "chatgpt");

        List<String> reversedWords = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());

        System.out.println("Reversed words: " + reversedWords);
    }
}
