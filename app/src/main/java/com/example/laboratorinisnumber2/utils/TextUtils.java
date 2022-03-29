package com.example.laboratorinisnumber2.utils;

import java.util.Objects;

public class TextUtils {
    public static int getCharsCount(String input){
        return input.length();
    }
    public static int getWordsCount(String input){
        input = input.trim();
        if(Objects.equals(input, ""))
        {
            return 0;
        }
        String[] parts = TextUtils.SplitString(input);
        return parts.length;
    }
    public static String[] SplitString(String _stringToSplit)
    {
        return _stringToSplit.split(" ");
    }
    public static int getCharsNoSpaceCount(String input) {
    int charCount = 0;
        input = input.trim();
        if(Objects.equals(input, ""))
        {
            return 0;
        }
    String[] parts = TextUtils.SplitString(input);
            for (int i = 0; i < parts.length; i++)
    {
        charCount += parts[i].trim().length();
    }
            return charCount;
    }
}
