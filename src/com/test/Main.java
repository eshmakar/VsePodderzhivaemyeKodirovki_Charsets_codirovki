package com.test;

import java.nio.charset.Charset;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Charset> charsets = Charset.availableCharsets();//выводит информацию обо всех поддерживаемых кодировках
        int count = 0;
        for (String x : charsets.keySet())
            System.out.println(++count + ". " + x);
    }
}
