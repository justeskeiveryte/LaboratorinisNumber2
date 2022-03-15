package com.example.laboratorinisnumber2.utils;

public class TextUtils {
    public static int getCharsCount(String input){
        return input.length();
    }
    public static int getWordsCount(String input){
        String[] parts = TextUtils.SplitString(input);
        return parts.length;
    }
    public static String[] SplitString(String _stringToSplit)
    {
        return _stringToSplit.split(" ");
    }
    public static int getCharsNoSpaceCount(String input) {
    int charCount = 0;
    String[] parts = TextUtils.SplitString(input);
            for (int i = 0; i < parts.length; i++)
    {
        charCount += parts[i].trim().length();
    }
            return charCount;
    }
}
