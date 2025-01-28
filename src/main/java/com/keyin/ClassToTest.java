package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class ClassToTest {
    private final List<String> listOfStrings = new ArrayList<String>();


    public List<String> methodToTest(String word) {
        if (!listOfStrings.contains(word.toLowerCase())) {
            listOfStrings.add(word.toLowerCase());
        }

        return listOfStrings;
    }
}